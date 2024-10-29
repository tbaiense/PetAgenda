package petagenda.bd;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import petagenda.exception.IllegalArgumentsException;
import petagenda.exception.IllegalServicoException;

//import petagenda.servico.*;
import petagenda.dados.*;
import petagenda.exception.IllegalUsuarioException;

/** Representa a API principal do software com o driver do SGBD. Contém os 
 * métodos necessários para as operações de CRUD envolvendo as demais classes
 * do PetAgenda.
 *
 * @author Thiago M. Baiense
 */
public class BD {
    static final String SGBD = "mysql";
    static final String ADDRESS = "localhost";
    static final String PORT = "3306";
    static final String SCHEMA = "pet_agenda";
    static final String USER = "root";
    static final String USER_PWD = "";
    
    static {
        DriverManager.setLoginTimeout(5);
    }
    
    public static Connection getConnection() {
        try {
            final String connStr = String.format("jdbc:%s://%s:%s/%s", SGBD, ADDRESS, PORT, SCHEMA); 
            Connection conn = DriverManager.getConnection(connStr, USER, USER_PWD);
            return conn;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível estabelecer uma conexão com o banco especificado.\nVerifique as configurações definidas e tente novamente.", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    static public class Usuario {
        public static final String TABLE = "usuario";
        
        public static int insert(petagenda.Usuario usuario) {
            int r = 0;
            
            if (usuario == null ) {
                throw new NullPointerException("Serviço não pode ser nulo");
            } else if (usuario.getServico().isNew() || usuario.getPermissao() != null && usuario.getPermissao().isNew()){ // Servico prestado precisa associado precisa estar cadastrado
                throw new IllegalUsuarioException("Usuario contém ou um serviço não cadastrado ou uma permissão inexistente no banco de dados");
            } else {
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("INSERT INTO %s(nome, id_endereco, cpf, telefone, senha, id_servico_presta, id_permissao, id_local_atuacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", TABLE));
                       
                        // Cadastro individual do endereco no BD
                        petagenda.dados.Endereco endereco = usuario.getEndereco();
                        int id_endereco;
                        
//                        if (endereco.isNew()) {
                            BD.Endereco.insert(endereco);
                            id_endereco = BD.Endereco.selectLast().getId();
//                        } else {
//                            id_endereco = endereco.getId();
//                        }
                        
                        insert.setString(1, usuario.getNome());
                        insert.setInt(2, id_endereco);
                        
                        petagenda.dados.CPF cpf = usuario.getCpf();
                        String strCpf;
                        if (cpf != null) {
                            strCpf = cpf.toString();
                        } else {
                            strCpf = null;
                        }
                        insert.setString(3, strCpf);
                        
                        insert.setString(4, usuario.getTelefone());
                        insert.setString(5, usuario.getSenha());
                        insert.setInt(6, usuario.getServico().getId());
                        
                        petagenda.dados.Permissao permissao = usuario.getPermissao();
                        if (permissao != null) {
                            insert.setInt(7, permissao.getId());
                        } else {
                            insert.setNull(7, java.sql.Types.INTEGER);
                        }
                        
                        // Criação do local de atuação
                        // OBS.: Deveria ser implementado uma maneira de reaproveitar locais de atuação semelhantes já existentes no banco
                        int id_local_atuacao;
                        petagenda.dados.LocalAtuacao localAtuacao = usuario.getLocalAtuacao();
                        if (localAtuacao.isNew()) { // Se não for cadastrado no banco
                            BD.LocalAtuacao.insert(localAtuacao);
                            id_local_atuacao = BD.LocalAtuacao.selectLast().getId();
                        } else {
                            id_local_atuacao = localAtuacao.getId();
                        }
                        
                        insert.setInt(8, id_local_atuacao);
                        
                        r = insert.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do insert", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 
                    
                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }
                    
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }
        
        public static int delete(petagenda.Usuario usuario) {
            int r = 0;
            
            if (usuario == null ) {
                throw new NullPointerException("Usuario não pode ser nulo");
            } else if (!usuario.isNew() && !usuario.getEndereco().isNew() && !usuario.getLocalAtuacao().isNew()){ // Só inicia conexão se Usuario, Endereco e LocalAtuacao forem cadastrados
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("DELETE FROM %s WHERE id = ?", TABLE));
                        insert.setInt(1, usuario.getId());
                        
                        r = insert.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do delete", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 
                    
                    // Deleção do endereço associado
                    BD.Endereco.delete(usuario.getEndereco());
                    
                    // Deleção do local de atuação associado
                    if (BD.Usuario.selectByLocalAtuacao(usuario.getLocalAtuacao()) == null) { // Se não houver outro Usuario usando o mesmo local de atuacao
                        BD.LocalAtuacao.delete(usuario.getLocalAtuacao());
                    }
                    
                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }
                    
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }

        public static int update(petagenda.Usuario usuario) {
            int r = 0;

            if (usuario == null ) {
                throw new NullPointerException("Local de atuação não pode ser nulo");
            } else if (!usuario.isNew() && !usuario.getServico().isNew() && usuario.getPermissao() == null || usuario.getPermissao() != null && !usuario.getPermissao().isNew()){ // Só inicia conexão se Usuario informado possuir id válido e o Servico for cadastrado e Permissao já estiver cadastrado
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("UPDATE %s SET nome = ?, cpf = ?, telefone = ?, senha = ?, id_servico_presta = ?, id_permissao = ?, id_local_atuacao = ? WHERE id = ?", TABLE));
                        
                        petagenda.dados.Endereco enderecoUsuario = usuario.getEndereco();
                        
                        // Atualização do endereco do Usuario se mudou
                        petagenda.Usuario usuarioCadastrado = BD.Usuario.selectById(usuario.getId());
                        petagenda.dados.Endereco enderecoCadastrado = usuarioCadastrado.getEndereco();
                        int id_endereco_cadastrado = enderecoCadastrado.getId();
                        
                        // Verificação se Endereco do objeto difere do recebido do banco
                        if (!enderecoUsuario.deepEquals(enderecoCadastrado)) { // Se Endereco do objeto difere do cadastrado no Usuario do banco
                            enderecoUsuario.setId(id_endereco_cadastrado);
                            BD.Endereco.update(enderecoUsuario);
                        }
                        
                        insert.setString(1, usuario.getNome());
                        petagenda.dados.CPF cpf = usuario.getCpf();
                        String strCpf;
//                        if (cpf == null) {
//                            strCpf = null;
//                        } else {
                            strCpf = cpf.toString();
//                        }
                        insert.setString(2, strCpf);
                        insert.setString(3, usuario.getTelefone());
                        insert.setString(4, usuario.getSenha());
                        insert.setInt(5, usuario.getServico().getId());
                        
                        petagenda.dados.Permissao permissao = usuario.getPermissao();
                        if (permissao != null) {
                            insert.setInt(6, permissao.getId());
                        } else {
                            insert.setNull(6, java.sql.Types.INTEGER);
                        }
                        
                        // Controle de atualização do Local de atuação
                        petagenda.dados.LocalAtuacao localAtuacaoUsuario = usuario.getLocalAtuacao();
                        int id_local_atuacao_usuario = localAtuacaoUsuario.getId();
                        
                        petagenda.dados.LocalAtuacao localAtuacaoCadastrado = BD.Usuario.selectById(usuario.getId()).getLocalAtuacao();
                        int id_local_atuacao_cadastrado = localAtuacaoCadastrado.getId();
                        
                        boolean apagarLocalAtuacaoCadastrado = false;
                        int locaisEncontrados = BD.Usuario.selectByLocalAtuacao(localAtuacaoCadastrado).length;
                        
                        if (locaisEncontrados == 1) { // Somente este usuário usa o local de atuação cadastrados
                            if (localAtuacaoUsuario.isNew()) {
                                localAtuacaoUsuario.setId(id_local_atuacao_cadastrado);
                                BD.LocalAtuacao.update(localAtuacaoUsuario);
                                insert.setInt(7, id_local_atuacao_cadastrado);
                            } else if (id_local_atuacao_usuario != id_local_atuacao_cadastrado) {
                                insert.setInt(7, id_local_atuacao_usuario);
                                apagarLocalAtuacaoCadastrado = true;
                            } else { // É o mesmo id de local de atuação
                                if (!localAtuacaoUsuario.deepEquals(localAtuacaoCadastrado)) {
                                    BD.LocalAtuacao.update(localAtuacaoUsuario);
                                }
                                insert.setInt(7, id_local_atuacao_usuario);
                            }
                        } else { 
                            if (localAtuacaoUsuario.isNew()) {
                                BD.LocalAtuacao.insert(localAtuacaoUsuario);
                                insert.setInt(7, BD.LocalAtuacao.selectLast().getId());
                            } else {
                                insert.setInt(7, id_local_atuacao_usuario);
                            }

                        }
                        
                        insert.setInt(8, usuario.getId());
                        
                        r = insert.executeUpdate();
                        
                        if (apagarLocalAtuacaoCadastrado) {
                            BD.LocalAtuacao.delete(localAtuacaoCadastrado);
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do update", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 

                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }
        
        public static petagenda.Usuario selectById(int id) {
            petagenda.Usuario usuario = null;
            
            if (id != petagenda.Usuario.NULL_ID) {
                Connection conn = BD.getConnection();
                if (conn != null) { // Se banco for acessível
                    // Criação do statement
                    PreparedStatement select = null;
                    try {    
                        select = conn.prepareStatement(
                            String.format("SELECT id, nome, id_endereco, cpf, telefone, senha, id_servico_presta, id_permissao, id_local_atuacao FROM %s WHERE id = ?", TABLE));
                        select.setInt(1, id);

                        ResultSet rs = select.executeQuery();
                        petagenda.Usuario[] selected = parse(rs);
                        
                        if (selected != null) {
                            usuario = selected[0];
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                    } 

                    if (select != null) { // Se preparedStatement não falhou
                        try {
                            select.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            select = null;
                        }
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return usuario;
        } 
        
        public static petagenda.Usuario[] selectAll() {
            petagenda.Usuario[] usuarios = null;
            
            Connection conn = BD.getConnection();
            if (conn != null) { // Se banco for acessível
                // Criação do statement
                PreparedStatement select = null;
                try {    
                    select = conn.prepareStatement(
                        String.format("SELECT id, nome, id_endereco, cpf, telefone, senha, id_servico_presta, id_permissao, id_local_atuacao FROM %s", TABLE));

                    ResultSet rs = select.executeQuery();
                    usuarios = parse(rs);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                } 

                if (select != null) { // Se preparedStatement não falhou
                    try {
                        select.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        select = null;
                    }
                }

                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conn = null;
                }
            }
            return usuarios;
        }
        
        public static petagenda.Usuario selectLast() {
            petagenda.Usuario usuario = null;
            
            Connection conn = BD.getConnection();
            if (conn != null) { // Se banco for acessível
                // Criação do statement
                PreparedStatement select = null;
                try {    
                    select = conn.prepareStatement(
                        String.format("SELECT id, nome, id_endereco, cpf, telefone, senha, id_servico_presta, id_permissao, id_local_atuacao FROM %s ORDER BY id DESC LIMIT 1", TABLE));

                    ResultSet rs = select.executeQuery();
                    petagenda.Usuario[] selected = parse(rs);

                    if (selected != null) {
                        usuario = selected[0];
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                } 

                if (select != null) { // Se preparedStatement não falhou
                    try {
                        select.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        select = null;
                    }
                }

                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conn = null;
                }
            }

            return usuario;
        }
        
        public static petagenda.Usuario[] selectByLocalAtuacao(petagenda.dados.LocalAtuacao localAtuacao) {
            petagenda.Usuario[] usuarios = null;
            
            if (localAtuacao == null ) {
                throw new NullPointerException("Local de Atuação não pode ser nulo");
            } else if (!localAtuacao.isNew()) {
                Connection conn = BD.getConnection();
                if (conn != null) { // Se banco for acessível
                    // Criação do statement
                    PreparedStatement select = null;
                    try {    
                        select = conn.prepareStatement(
                            String.format("SELECT id, nome, id_endereco, cpf, telefone, senha, id_servico_presta, id_permissao, id_local_atuacao FROM %s WHERE id_local_atuacao = ?", TABLE));
                        select.setInt(1, localAtuacao.getId());

                        ResultSet rs = select.executeQuery();
                        usuarios = parse(rs);
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                    } 

                    if (select != null) { // Se preparedStatement não falhou
                        try {
                            select.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            select = null;
                        }
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return usuarios;
        }
        
        public static petagenda.Usuario[] parse(ResultSet rs) {
            if (rs == null) {
                throw new NullPointerException("ResultSet não pode ser nulo");
            } else {
                ArrayList<petagenda.Usuario> uList = new ArrayList<petagenda.Usuario>();
                petagenda.Usuario[] uArray = null;
                
                try {
                    while(rs.next()) {
                        petagenda.Usuario u;
                        int id, id_servico_presta, id_endereco, id_permissao, id_local_atuacao;
                        String nome, telefone, strCpf, senha;
                        petagenda.servico.Servico servicoPresta;
                        petagenda.dados.Endereco endereco;
                        petagenda.dados.LocalAtuacao localAtuacao;
                        petagenda.dados.CPF cpf;
                        petagenda.dados.Permissao permissao;
                        
                        // Recebimento dos dados do ResultSet
                        id = rs.getInt("id");
                        
                        id_endereco = rs.getInt("id_endereco");
                        endereco = BD.Endereco.selectById(id_endereco);
                        
                        id_local_atuacao = rs.getInt("id_local_atuacao");
                        localAtuacao = BD.LocalAtuacao.selectById(id_local_atuacao);
                        
                        nome = rs.getString("nome");
                        
                        strCpf = rs.getString("cpf");
//                        if (strCpf == null) {
//                            cpf = null;
//                        } else {
                            cpf = new CPF(strCpf);
//                        }
                        
                        telefone = rs.getString("telefone");
                        
                        id_servico_presta = rs.getInt("id_servico_presta");
                        servicoPresta = BD.Servico.selectById(id_servico_presta); // Null, se não encontrar
                        
                        senha = rs.getString("senha");
                        
                        id_permissao = rs.getInt("id_permissao");
                        permissao = BD.Permissao.selectById(id_permissao);
                        
                        // Verificação dos dados e criação do objeto
                        try {
                            u = new petagenda.Usuario(id, nome, endereco, strCpf, telefone, servicoPresta, localAtuacao);
                            
                            if (senha != null) {
                                u.setSenha(senha);
                            }
                            
                            if (permissao != null) {
                                u.setPermissao(permissao);
                            }
                            
                            uList.add(u);
                        } catch (IllegalArgumentsException exs) {
                            StringBuilder strEx = new StringBuilder(String.format("Erro ao receber Usuario (id= %d):\n", id));
                            for (Throwable cause : exs.getCauses()) {
                                strEx.append(cause.getMessage());
                                strEx.append("\n");
                            }
                            System.out.println(strEx.toString());
                        }
                    }
                    if (!uList.isEmpty()) {
                        uArray = new petagenda.Usuario[uList.size()];
                        uArray = uList.toArray(uArray);
                    }
                } catch (SQLException e) {
                    System.out.printf("Erro ao fazer parse de ResultSet contendo Usuario: %s\n", e.getMessage());
                }
                
                return uArray;
            }
        }
    }
    
    static public class Cliente {
        public static final String TABLE = "cliente";
        
        public static int insert(petagenda.Cliente cliente) {
            int r = 0;
            
            if (cliente == null ) {
                throw new NullPointerException("Serviço não pode ser nulo");
            } else if (cliente.getServico().isNew()){ // Servico solicitado precisa associado precisa estar cadastrado
                throw new IllegalServicoException("Serviço solicitado não pode conter um tipo de serviço ainda não cadastrado");
            } else {
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("INSERT INTO %s(id_endereco, nome, cpf, telefone, id_servico_solicita, buscar_com, devolver_para) VALUES (?, ?, ?, ?, ?, ?, ?)", TABLE));
                        petagenda.dados.Endereco endereco = cliente.getEndereco();
                        int id_endereco;
                        
//                        if (endereco.isNew()) {
                            BD.Endereco.insert(endereco);
                            id_endereco = BD.Endereco.selectLast().getId();
//                        } else {
//                            id_endereco = endereco.getId();
//                        }
                        
                        insert.setInt(1, id_endereco);
                        insert.setString(2, cliente.getNome());
                        petagenda.dados.CPF cpf = cliente.getCpf();
                        String strCpf;
                        if (cpf == null) {
                            strCpf = null;
                        } else {
                            strCpf = cpf.toString();
                        }
                        insert.setString(3, strCpf);
                        insert.setString(4, cliente.getTelefone());
                        insert.setInt(5, cliente.getServico().getId());
                        insert.setString(6, cliente.getBuscarPetCom());
                        insert.setString(7, cliente.getDevolverPetPara());
                        
                        r = insert.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do insert", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 
                    
                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }
                    
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }
        
        public static int delete(petagenda.Cliente cliente) {
            int r = 0;
            
            if (cliente == null ) {
                throw new NullPointerException("Cliente não pode ser nulo");
            } else if (!cliente.isNew() && !cliente.getEndereco().isNew()){ // Só inicia conexão se Cliente e Endereco for cadastrado
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("DELETE FROM %s WHERE id = ?", TABLE));
                        insert.setInt(1, cliente.getId());
                        
                        r = insert.executeUpdate();
                        
                        // Deleção do endereço associado;
                        BD.Endereco.delete(cliente.getEndereco());
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do delete", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 
                    
                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }
                    
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }

        public static int update(petagenda.Cliente cliente) {
            int r = 0;

            if (cliente == null ) {
                throw new NullPointerException("Local de atuação não pode ser nulo");
            } else if (!cliente.isNew() && !cliente.getServico().isNew()){ // Só inicia conexão se Cliente informado possuir id válido e o Servico for cadastrado e endereço já estiver cadastrado
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("UPDATE %s SET nome = ?, cpf = ?, telefone = ?, id_servico_solicita = ?, buscar_com = ?, devolver_para = ? WHERE id = ?", TABLE));
                        
                        petagenda.dados.Endereco enderecoCliente = cliente.getEndereco();
                        
                        // Atualização do endereco do cliente se mudou
                        petagenda.Cliente clienteCadastrado = BD.Cliente.selectById(cliente.getId());
                        petagenda.dados.Endereco enderecoCadastrado = clienteCadastrado.getEndereco();
                        int id_endereco_cadastrado = enderecoCadastrado.getId();
                        
                        // Verificação se Endereco do objeto difere do recebido do banco
                        if (!enderecoCliente.deepEquals(enderecoCadastrado)) { // Se Endereco do objeto difere do cadastrado no cliente do banco
                            enderecoCliente.setId(id_endereco_cadastrado);
                            BD.Endereco.update(enderecoCliente);
                        }
                        
                        insert.setString(1, cliente.getNome());
                        petagenda.dados.CPF cpf = cliente.getCpf();
                        String strCpf;
                        if (cpf == null) {
                            strCpf = null;
                        } else {
                            strCpf = cpf.toString();
                        }
                        insert.setString(2, strCpf);
                        insert.setString(3, cliente.getTelefone());
                        insert.setInt(4, cliente.getServico().getId());
                        insert.setString(5, cliente.getBuscarPetCom());
                        insert.setString(6, cliente.getDevolverPetPara());
                        insert.setInt(7, cliente.getId());
                        
                        r = insert.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do update", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 

                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }
        
        public static petagenda.Cliente selectById(int id) {
            petagenda.Cliente cliente = null;
            
            if (id != petagenda.Cliente.NULL_ID) {
                Connection conn = BD.getConnection();
                if (conn != null) { // Se banco for acessível
                    // Criação do statement
                    PreparedStatement select = null;
                    try {    
                        select = conn.prepareStatement(
                            String.format("SELECT id, id_endereco, nome, cpf, telefone, id_servico_solicita, buscar_com, devolver_para FROM %s WHERE id = ?", TABLE));
                        select.setInt(1, id);

                        ResultSet rs = select.executeQuery();
                        petagenda.Cliente[] selected = parse(rs);
                        
                        if (selected != null) {
                            cliente = selected[0];
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                    } 

                    if (select != null) { // Se preparedStatement não falhou
                        try {
                            select.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            select = null;
                        }
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return cliente;
        } 
        
        public static petagenda.Cliente[] selectAll() {
            petagenda.Cliente[] clientes = null;
            
            Connection conn = BD.getConnection();
            if (conn != null) { // Se banco for acessível
                // Criação do statement
                PreparedStatement select = null;
                try {    
                    select = conn.prepareStatement(
                        String.format("SELECT id, id_endereco, nome, cpf, telefone, id_servico_solicita, buscar_com, devolver_para FROM %s", TABLE));

                    ResultSet rs = select.executeQuery();
                    clientes = parse(rs);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                } 

                if (select != null) { // Se preparedStatement não falhou
                    try {
                        select.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        select = null;
                    }
                }

                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conn = null;
                }
            }
            return clientes;
        }
        
        public static petagenda.Cliente selectLast() {
            petagenda.Cliente cliente = null;
            
            Connection conn = BD.getConnection();
            if (conn != null) { // Se banco for acessível
                // Criação do statement
                PreparedStatement select = null;
                try {    
                    select = conn.prepareStatement(
                        String.format("SELECT id, id_endereco, nome, cpf, telefone, id_servico_solicita, buscar_com, devolver_para FROM %s ORDER BY id DESC LIMIT 1", TABLE));

                    ResultSet rs = select.executeQuery();
                    petagenda.Cliente[] selected = parse(rs);

                    if (selected != null) {
                        cliente = selected[0];
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                } 

                if (select != null) { // Se preparedStatement não falhou
                    try {
                        select.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        select = null;
                    }
                }

                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conn = null;
                }
            }

            return cliente;
        }
        
        public static petagenda.Cliente[] parse(ResultSet rs) {
            if (rs == null) {
                throw new NullPointerException("ResultSet não pode ser nulo");
            } else {
                ArrayList<petagenda.Cliente> cList = new ArrayList<petagenda.Cliente>();
                petagenda.Cliente[] cArray = null;
                
                try {
                    while(rs.next()) {
                        petagenda.Cliente c;
                        int id, id_servico_solicita, id_endereco;
                        String nome, telefone, buscar_com, devolver_para;
                        petagenda.servico.Servico servicoSolicita;
                        petagenda.dados.Endereco endereco;
                        petagenda.dados.CPF cpf;
                        
                        // Recebimento dos dados do ResultSet
                        id = rs.getInt("id");
                        
                        id_endereco = rs.getInt("id_endereco");
                        endereco = BD.Endereco.selectById(id_endereco); // Null, se não encontrar
                        
                        nome = rs.getString("nome");
                        
                        String strCpf = rs.getString("cpf");
                        if (strCpf == null) {
                            cpf = null;
                        } else {
                            cpf = new CPF(strCpf);
                        }
                        
                        telefone = rs.getString("telefone");
                        
                        id_servico_solicita = rs.getInt("id_servico_solicita");
                        servicoSolicita = BD.Servico.selectById(id_servico_solicita); // Null, se não encontrar
                        
                        buscar_com = rs.getString("buscar_com");
                        devolver_para = rs.getString("devolver_para");
                        
                        // Verificação dos dados e criação do objeto
                        try {
                            c = new petagenda.Cliente(id, nome, endereco, telefone, servicoSolicita);
                            
                            if (cpf != null) {
                                c.setCpf(cpf);
                            }
                            
                            if (buscar_com != null) {
                                c.setBuscarPetCom(buscar_com);
                            }
                            
                            if (devolver_para != null) {
                                c.setDevolverPetPara(devolver_para);
                            }
                            
                            cList.add(c);
                        } catch (IllegalArgumentsException exs) {
                            StringBuilder strEx = new StringBuilder(String.format("Erro ao receber Cliente (id= %d):\n", id));
                            for (Throwable cause : exs.getCauses()) {
                                strEx.append(cause.getMessage());
                                strEx.append("\n");
                            }
                            System.out.println(strEx.toString());
                        }
                    }
                    if (!cList.isEmpty()) {
                        cArray = new petagenda.Cliente[cList.size()];
                        cArray = cList.toArray(cArray);
                    }
                } catch (SQLException e) {
                    System.out.printf("Erro ao fazer parse de ResultSet contendo Cliente: %s", e.getMessage());
                }
                
                return cArray;
            }
        }
    }
    
    static public class Permissao {
        static final String TABLE = "permissao";
        
        public static petagenda.dados.Permissao[] selectAll() {
            try {
                Connection conn = BD.getConnection();
                if (conn == null) {
                    return null;
                }
                String selectStr = String.format("SELECT id, nome FROM %s", TABLE);
                PreparedStatement select = conn.prepareStatement(selectStr);
                
                ResultSet rs = select.executeQuery();
                petagenda.dados.Permissao[] permissoes = BD.Permissao.parse(rs);
                
                return permissoes;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível realizar o SELECT.\nVerifique as informações relevantes e tente novamente.", "Erro de SELECT", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        }
//        
        public static petagenda.dados.Permissao selectById(int id) {
            petagenda.dados.Permissao permissao = null;
            
            if (id != petagenda.dados.Permissao.NULL_ID) {
                Connection conn = BD.getConnection();
                if (conn != null) { // Se banco for acessível
                    // Criação do statement
                    PreparedStatement select = null;
                    try {    
                        select = conn.prepareStatement(
                            String.format("SELECT id, nome FROM %s WHERE id = ?", TABLE));
                        select.setInt(1, id);

                        ResultSet rs = select.executeQuery();
                        petagenda.dados.Permissao[] selected = parse(rs);
                        
                        if (selected != null) {
                            permissao = selected[0];
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                    } 

                    if (select != null) { // Se preparedStatement não falhou
                        try {
                            select.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            select = null;
                        }
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            
            return permissao;
        }
        
        public static petagenda.dados.Permissao[] parse(ResultSet rs) throws SQLException {
            if (rs == null) {
                throw new NullPointerException("ResultSet não pode ser null");
            }
            
            ArrayList<petagenda.dados.Permissao> pList = new ArrayList<petagenda.dados.Permissao>();
            try {
                while (rs.next()) {
                    petagenda.dados.Permissao permissao;
                    String nome;
                    int id;

                    id = rs.getInt("id");
                    nome = rs.getString("nome");

                    permissao = new petagenda.dados.Permissao(id, nome);
                    pList.add(permissao);
                }
                if (!pList.isEmpty()) {
                    petagenda.dados.Permissao[] permissoes = new petagenda.dados.Permissao[pList.size()];
                    pList.toArray(permissoes);
                    return permissoes;
                }
            } catch (SQLException e) {
                System.out.printf("Erro ao fazer parse de ResultSet contendo Permissao: %s", e.getMessage());
            }
            
            return null;
        }
    }
    
    static public class Endereco {
        public static final String TABLE = "endereco";
        
        public static int insert(petagenda.dados.Endereco endereco) {
            int r = 0;
            
            if (endereco == null ) {
                throw new NullPointerException("Endereço não pode ser nulo");
            } else {
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("INSERT INTO %s(rua, numero, bairro, cidade, cep) VALUES (?, ?, ?, ?, ?)", TABLE));
                        insert.setString(1, endereco.RUA);
                        insert.setString(2, endereco.NUMERO);
                        insert.setString(3, endereco.BAIRRO);
                        insert.setString(4, endereco.CIDADE);
                        insert.setString(5, endereco.CEP);
                        
                        r = insert.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do insert", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 
                    
                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }
                    
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }
        
        public static int delete(petagenda.dados.Endereco endereco) {
            int r = 0;
            
            if (endereco == null ) {
                throw new NullPointerException("Endereço não pode ser nulo");
            } else if (endereco.getId() != petagenda.dados.Endereco.NULL_ID){ // Só inicia conexão de Endereco informado possuir id válido
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("DELETE FROM %s WHERE id = ?", TABLE));
                        insert.setInt(1, endereco.getId());
                        
                        r = insert.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do delete", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 
                    
                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }
                    
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }
        
        public static int update(petagenda.dados.Endereco endereco) {
            int r = 0;

            if (endereco == null ) {
                throw new NullPointerException("Endereço não pode ser nulo");
            } else if (endereco.getId() != petagenda.dados.Endereco.NULL_ID){ // Só inicia conexão de Endereco informado possuir id válido
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("UPDATE %s SET rua = ?, numero = ?, bairro = ?, cidade = ?, cep = ? WHERE id = ?", TABLE));
                        insert.setString(1, endereco.RUA);
                        insert.setString(2, endereco.NUMERO);
                        insert.setString(3, endereco.BAIRRO);
                        insert.setString(4, endereco.CIDADE);
                        insert.setString(5, endereco.CEP);
                        insert.setInt(6, endereco.getId());

                        r = insert.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do update", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 

                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }
    
        public static petagenda.dados.Endereco[] selectAll() {
            petagenda.dados.Endereco[] enderecos = null;
            
            Connection conn = BD.getConnection();
            if (conn != null) { // Se banco for acessível
                // Criação do statement
                PreparedStatement select = null;
                try {    
                    select = conn.prepareStatement(
                        String.format("SELECT id, rua, numero, bairro, cidade, cep FROM %s", TABLE));

                    ResultSet rs = select.executeQuery();
                    enderecos = parse(rs);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                } 

                if (select != null) { // Se preparedStatement não falhou
                    try {
                        select.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        select = null;
                    }
                }

                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conn = null;
                }
            }
            
            return enderecos;
        }
        
        public static petagenda.dados.Endereco selectById(int id) {
            petagenda.dados.Endereco endereco = null;
            
            if (id != petagenda.dados.Endereco.NULL_ID) {
                Connection conn = BD.getConnection();
                if (conn != null) { // Se banco for acessível
                    // Criação do statement
                    PreparedStatement select = null;
                    try {    
                        select = conn.prepareStatement(
                            String.format("SELECT id, rua, numero, bairro, cidade, cep FROM %s WHERE id = ?", TABLE));
                        select.setInt(1, id);

                        ResultSet rs = select.executeQuery();
                        petagenda.dados.Endereco[] selected = parse(rs);
                        
                        if (selected != null) {
                            endereco = selected[0];
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                    } 

                    if (select != null) { // Se preparedStatement não falhou
                        try {
                            select.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            select = null;
                        }
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            
            return endereco;
        }
        
          public static petagenda.dados.Endereco selectLast() {
            petagenda.dados.Endereco endereco = null;
            
            Connection conn = BD.getConnection();
            if (conn != null) { // Se banco for acessível
                // Criação do statement
                PreparedStatement select = null;
                try {    
                    select = conn.prepareStatement(
                        String.format("SELECT id, rua, numero, bairro, cidade, cep FROM %s ORDER BY id DESC LIMIT 1", TABLE));

                    ResultSet rs = select.executeQuery();
                    petagenda.dados.Endereco[] selected = parse(rs);

                    if (selected != null) {
                        endereco = selected[0];
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                } 

                if (select != null) { // Se preparedStatement não falhou
                    try {
                        select.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        select = null;
                    }
                }

                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conn = null;
                }
            }
            
            return endereco;
        }
        
        public static petagenda.dados.Endereco[] parse(ResultSet rs) {
            if (rs == null) {
                throw new NullPointerException("ResultSet não pode ser nulo");
            } else {
                ArrayList<petagenda.dados.Endereco> eList = new ArrayList<petagenda.dados.Endereco>();
                petagenda.dados.Endereco[] eArray = null;
                
                try {
                    while(rs.next()) {
                        petagenda.dados.Endereco e;
                        int id = -1;
                        String rua, numero, bairro, cidade, cep;
                        
                        id = rs.getInt("id");
                        rua = rs.getString("rua");
                        numero = rs.getString("numero");
                        bairro = rs.getString("bairro");
                        cidade = rs.getString("cidade");
                        cep = rs.getString("cep");
                        
                        // Verificação dos dados e criação do objeto
                        try {
                            e = new petagenda.dados.Endereco(id, rua, numero, bairro, cidade, cep);
                            eList.add(e);
                        } catch (IllegalArgumentsException exs) {
                            StringBuilder strEx = new StringBuilder(String.format("Erro ao receber Endereco (id= %d):\n", id));
                            for (Throwable c : exs.getCauses()) {
                                strEx.append(c.getMessage());
                                strEx.append("\n");
                            }
                            System.out.println(strEx.toString());
                        }
                    }
                    if (!eList.isEmpty()) {
                        eArray = new petagenda.dados.Endereco[eList.size()];
                        eArray = eList.toArray(eArray);
                    }
                } catch (SQLException e) {
                    System.out.printf("Erro ao fazer parse de ResultSet contendo Endereco: %s", e.getMessage());
                }
                
                return eArray;
            }
        }
    }
    
    static public class LocalAtuacao {
        public static final String TABLE = "local_atuacao";
        
        public static int insert(petagenda.dados.LocalAtuacao localAtuacao) {
            int r = 0;
            
            if (localAtuacao == null ) {
                throw new NullPointerException("Local de atuação não pode ser nulo");
            } else {
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("INSERT INTO %s(bairro, cidade) VALUES (?, ?)", TABLE));
                        insert.setString(1, localAtuacao.BAIRRO);
                        insert.setString(2, localAtuacao.CIDADE);
                        
                        r = insert.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do insert", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 
                    
                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }
                    
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }
        
        public static int delete(petagenda.dados.LocalAtuacao localAtuacao) {
            int r = 0;
            
            if (localAtuacao == null ) {
                throw new NullPointerException("Local de atuação não pode ser nulo");
            } else if (localAtuacao.getId() != petagenda.dados.Endereco.NULL_ID){ // Só inicia conexão de Endereco informado possuir id válido
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("DELETE FROM %s WHERE id = ?", TABLE));
                        insert.setInt(1, localAtuacao.getId());
                        
                        r = insert.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do delete", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 
                    
                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }
                    
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }
        
        public static int update(petagenda.dados.LocalAtuacao localAtuacao) {
            int r = 0;

            if (localAtuacao == null ) {
                throw new NullPointerException("Local de atuação não pode ser nulo");
            } else if (localAtuacao.getId() != petagenda.dados.LocalAtuacao.NULL_ID){ // Só inicia conexão de Endereco informado possuir id válido
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("UPDATE %s SET bairro = ?, cidade = ? WHERE id = ?", TABLE));
                        insert.setString(1, localAtuacao.BAIRRO);
                        insert.setString(2, localAtuacao.CIDADE);
                        insert.setInt(3, localAtuacao.getId());

                        r = insert.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do update", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 

                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }
    
        public static petagenda.dados.LocalAtuacao[] selectAll() {
            petagenda.dados.LocalAtuacao[] locaisAtuacao = null;
            
            Connection conn = BD.getConnection();
            if (conn != null) { // Se banco for acessível
                // Criação do statement
                PreparedStatement select = null;
                try {    
                    select = conn.prepareStatement(
                        String.format("SELECT id, bairro, cidade FROM %s", TABLE));

                    ResultSet rs = select.executeQuery();
                    locaisAtuacao = parse(rs);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                } 

                if (select != null) { // Se preparedStatement não falhou
                    try {
                        select.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        select = null;
                    }
                }

                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conn = null;
                }
            }
            
            return locaisAtuacao;
        }
        
        public static petagenda.dados.LocalAtuacao selectById(int id) {
            petagenda.dados.LocalAtuacao localAtuacao = null;
            
            if (id != petagenda.dados.LocalAtuacao.NULL_ID) {
                Connection conn = BD.getConnection();
                if (conn != null) { // Se banco for acessível
                    // Criação do statement
                    PreparedStatement select = null;
                    try {    
                        select = conn.prepareStatement(
                            String.format("SELECT id, bairro, cidade FROM %s WHERE id = ?", TABLE));
                        select.setInt(1, id);

                        ResultSet rs = select.executeQuery();
                        petagenda.dados.LocalAtuacao[] selected = parse(rs);
                        
                        if (selected != null) {
                            localAtuacao = selected[0];
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                    } 

                    if (select != null) { // Se preparedStatement não falhou
                        try {
                            select.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            select = null;
                        }
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            
            return localAtuacao;
        }
        
        public static petagenda.dados.LocalAtuacao selectLast() {
            petagenda.dados.LocalAtuacao localAtuacao = null;
            
            Connection conn = BD.getConnection();
            if (conn != null) { // Se banco for acessível
                // Criação do statement
                PreparedStatement select = null;
                try {    
                    select = conn.prepareStatement(
                        String.format("SELECT id, bairro, cidade FROM %s ORDER BY id DESC LIMIT 1", TABLE));

                    ResultSet rs = select.executeQuery();
                    petagenda.dados.LocalAtuacao[] selected = parse(rs);

                    if (selected != null) {
                        localAtuacao = selected[0];
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                } 

                if (select != null) { // Se preparedStatement não falhou
                    try {
                        select.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        select = null;
                    }
                }

                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conn = null;
                }
            }
            
            return localAtuacao;
        }
        
        public static petagenda.dados.LocalAtuacao[] parse(ResultSet rs) {
            if (rs == null) {
                throw new NullPointerException("ResultSet não pode ser nulo");
            } else {
                ArrayList<petagenda.dados.LocalAtuacao> lList = new ArrayList<petagenda.dados.LocalAtuacao>();
                petagenda.dados.LocalAtuacao[] lArray = null;
                
                try {
                    while(rs.next()) {
                        petagenda.dados.LocalAtuacao l;
                        int id = -1;
                        String bairro, cidade;
                        
                        id = rs.getInt("id");
                        bairro = rs.getString("bairro");
                        cidade = rs.getString("cidade");
                        
                        // Verificação dos dados e criação do objeto
                        try {
                            l = new petagenda.dados.LocalAtuacao(id, bairro, cidade);
                            lList.add(l);
                        } catch (IllegalArgumentsException exs) {
                            StringBuilder strEx = new StringBuilder(String.format("Erro ao receber LocalAtuacao (id= %d):\n", id));
                            for (Throwable c : exs.getCauses()) {
                                strEx.append(c.getMessage());
                                strEx.append("\n");
                            }
                            System.out.println(strEx.toString());
                        }
                    }
                    if (!lList.isEmpty()) {
                        lArray = new petagenda.dados.LocalAtuacao[lList.size()];
                        lArray = lList.toArray(lArray);
                    }
                } catch (SQLException e) {
                    System.out.printf("Erro ao fazer parse de ResultSet contendo LocalAtuacao: %s", e.getMessage());
                }
                
                return lArray;
            }
        }
    }
    
    static public class Servico {
        public static final String TABLE = "servico_disponivel";
        
        public static int insert(petagenda.servico.Servico servico) {
            int r = 0;
            
            if (servico == null ) {
                throw new NullPointerException("Serviço não pode ser nulo");
            } else if (servico.getTipo() == null || servico.getTipo().getId() == petagenda.servico.TipoServico.NULL_ID){
                throw new IllegalServicoException("Serviço não pode conter um tipo de serviço ainda não cadastrado");
            } else {
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("INSERT INTO %s(nome, id_tipo_servico, duracao, preco, descricao) VALUES (?, ?, ?, ?, ?)", TABLE));
                        insert.setString(1, servico.getNome());
                        insert.setInt(2, servico.getTipo().getId());
                        insert.setInt(3, servico.getDuracao());
                        insert.setDouble(4, servico.getPreco());
                        insert.setString(5, servico.getDescricao());
                        
                        r = insert.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do insert", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 
                    
                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }
                    
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }
        
        public static int delete(petagenda.servico.Servico servico) {
            int r = 0;
            
            if (servico == null ) {
                throw new NullPointerException("Local de atuação não pode ser nulo");
            } else if (servico.getId() != petagenda.servico.Servico.NULL_ID){ // Só inicia conexão de Servico informado possuir id válido
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("DELETE FROM %s WHERE id = ?", TABLE));
                        insert.setInt(1, servico.getId());
                        
                        r = insert.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do delete", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 
                    
                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }
                    
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }
  
        public static int update(petagenda.servico.Servico servico) {
            int r = 0;

            if (servico == null ) {
                throw new NullPointerException("Local de atuação não pode ser nulo");
            } else if (servico.getId() != petagenda.servico.Servico.NULL_ID && servico.getTipo().getId() != petagenda.servico.TipoServico.NULL_ID){ // Só inicia conexão de Servico informado possuir id válido e o TipoServico for cadastrado
                Connection conn = BD.getConnection();
                if (conn == null) { // Se banco for inacessível
                    return r;
                } else {
                    // Criação do statement
                    PreparedStatement insert = null;
                    try {    
                        insert = conn.prepareStatement(
                            String.format("UPDATE %s SET nome = ?, id_tipo_servico = ?, duracao = ?, preco = ?, descricao = ? WHERE id = ?", TABLE));
                        insert.setString(1, servico.getNome());
                        insert.setInt(2, servico.getTipo().getId());
                        insert.setInt(3, servico.getDuracao());
                        insert.setDouble(4, servico.getPreco());
                        insert.setString(5, servico.getDescricao());
                        insert.setInt(6, servico.getId());

                        r = insert.executeUpdate();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de execução do update", JOptionPane.ERROR_MESSAGE);
                        r = -1;
                    } 

                    if (insert != null) { // Se preparedStatement não falhou
                        try {
                            insert.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            insert = null;
                        }
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return r;
        }
        
        public static petagenda.servico.Servico selectById(int id) {
            petagenda.servico.Servico servico = null;
            
            if (id != petagenda.servico.Servico.NULL_ID) {
                Connection conn = BD.getConnection();
                if (conn != null) { // Se banco for acessível
                    // Criação do statement
                    PreparedStatement select = null;
                    try {    
                        select = conn.prepareStatement(
                            String.format("SELECT id, nome, id_tipo_servico, duracao, preco, descricao FROM %s WHERE id = ?", TABLE));
                        select.setInt(1, id);

                        ResultSet rs = select.executeQuery();
                        petagenda.servico.Servico[] selected = parse(rs);
                        
                        if (selected != null) {
                            servico = selected[0];
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                    } 

                    if (select != null) { // Se preparedStatement não falhou
                        try {
                            select.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            select = null;
                        }
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            return servico;
        } 
        
        public static petagenda.servico.Servico[] selectAll() {
            petagenda.servico.Servico[] servicos = null;
            
            Connection conn = BD.getConnection();
            if (conn != null) { // Se banco for acessível
                // Criação do statement
                PreparedStatement select = null;
                try {    
                    select = conn.prepareStatement(
                        String.format("SELECT id, nome, id_tipo_servico, duracao, preco, descricao FROM %s", TABLE));

                    ResultSet rs = select.executeQuery();
                    servicos = parse(rs);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                } 

                if (select != null) { // Se preparedStatement não falhou
                    try {
                        select.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        select = null;
                    }
                }

                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conn = null;
                }
            }
            return servicos;
        }
        
        public static petagenda.servico.Servico selectLast() {
            petagenda.servico.Servico servico = null;
            
            Connection conn = BD.getConnection();
            if (conn != null) { // Se banco for acessível
                // Criação do statement
                PreparedStatement select = null;
                try {    
                    select = conn.prepareStatement(
                        String.format("SELECT id, nome, id_tipo_servico, duracao, preco, descricao FROM %s ORDER BY id DESC LIMIT 1", TABLE));

                    ResultSet rs = select.executeQuery();
                    petagenda.servico.Servico[] selected = parse(rs);

                    if (selected != null) {
                        servico = selected[0];
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                } 

                if (select != null) { // Se preparedStatement não falhou
                    try {
                        select.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        select = null;
                    }
                }

                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                } finally {
                    conn = null;
                }
            }

            return servico;
        }
        
        public static petagenda.servico.Servico[] parse(ResultSet rs) {
            if (rs == null) {
                throw new NullPointerException("ResultSet não pode ser nulo");
            } else {
                ArrayList<petagenda.servico.Servico> sList = new ArrayList<petagenda.servico.Servico>();
                petagenda.servico.Servico[] sArray = null;
                
                try {
                    while(rs.next()) {
                        petagenda.servico.Servico s;
                        int id = -1, id_tipo_servico, duracao;
                        String nome, descricao;
                        double preco;
                        petagenda.servico.TipoServico tipo;
                        
                        id = rs.getInt("id");
                        nome = rs.getString("nome");
                        id_tipo_servico = rs.getInt("id_tipo_servico");
                        tipo = BD.TipoServico.selectById(id_tipo_servico);
                        duracao = rs.getInt("duracao");
                        preco = rs.getDouble("preco");
                        descricao = rs.getString("descricao");
                        
                        // Verificação dos dados e criação do objeto
                        try {
                            s = new petagenda.servico.Servico(id, nome, tipo, duracao, preco, descricao);
                            sList.add(s);
                        } catch (IllegalArgumentsException exs) {
                            StringBuilder strEx = new StringBuilder(String.format("Erro ao receber Servico (id= %d):\n", id));
                            for (Throwable c : exs.getCauses()) {
                                strEx.append(c.getMessage());
                                strEx.append("\n");
                            }
                            System.out.println(strEx.toString());
                        }
                    }
                    if (!sList.isEmpty()) {
                        sArray = new petagenda.servico.Servico[sList.size()];
                        sArray = sList.toArray(sArray);
                    }
                } catch (SQLException e) {
                    System.out.printf("Erro ao fazer parse de ResultSet contendo Servico: %s", e.getMessage());
                }
                
                return sArray;
            }
        }
    }
    
    static public class TipoServico {
        static final String TABLE = "tipo_servico";
        
        public static petagenda.servico.TipoServico[] selectAll() {
            try {
                Connection conn = BD.getConnection();
                if (conn == null) {
                    return null;
                }
                String selectStr = String.format("SELECT id, nome FROM %s", TABLE);
                PreparedStatement select = conn.prepareStatement(selectStr);
                
                ResultSet rs = select.executeQuery();
                petagenda.servico.TipoServico[] tipos = BD.TipoServico.parse(rs);
                
                return tipos;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível realizar o SELECT.\nVerifique as informações relevantes e tente novamente.", "Erro de SELECT", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        }
        
        public static petagenda.servico.TipoServico selectById(int id) {
            petagenda.servico.TipoServico tipoServico = null;
            
            if (id != petagenda.servico.TipoServico.NULL_ID) {
                Connection conn = BD.getConnection();
                if (conn != null) { // Se banco for acessível
                    // Criação do statement
                    PreparedStatement select = null;
                    try {    
                        select = conn.prepareStatement(
                            String.format("SELECT id, nome FROM %s WHERE id = ?", TABLE));
                        select.setInt(1, id);

                        ResultSet rs = select.executeQuery();
                        petagenda.servico.TipoServico[] selected = parse(rs);
                        
                        if (selected != null) {
                            tipoServico = selected[0];
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro na execução da query", JOptionPane.ERROR_MESSAGE);
                    } 

                    if (select != null) { // Se preparedStatement não falhou
                        try {
                            select.close();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de PreparedStatement", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            select = null;
                        }
                    }

                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de fechamento de conexão", JOptionPane.ERROR_MESSAGE);
                    } finally {
                        conn = null;
                    }
                }
            }
            
            return tipoServico;
        }
        
        public static petagenda.servico.TipoServico[] parse(ResultSet rs) throws SQLException {
            if (rs == null) {
                throw new NullPointerException("ResultSet não pode ser null");
            }
            
            ArrayList<petagenda.servico.TipoServico> tList = new ArrayList<petagenda.servico.TipoServico>();
            try {
                while (rs.next()) {
                    petagenda.servico.TipoServico tipo;
                    String nome;
                    int id;

                    id = rs.getInt("id");
                    nome = rs.getString("nome");

                    tipo = new petagenda.servico.TipoServico(id, nome);
                    tList.add(tipo);
                }
                if (!tList.isEmpty()) {
                    petagenda.servico.TipoServico[] tipos = new petagenda.servico.TipoServico[tList.size()];
                    tList.toArray(tipos);
                    return tipos;
                }
            } catch (SQLException e) {
                System.out.printf("Erro ao fazer parse de ResultSet contendo TipoServico: %s", e.getMessage());
            }
            
            return null;
        }
    }
}
