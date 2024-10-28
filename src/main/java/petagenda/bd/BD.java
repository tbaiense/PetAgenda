package petagenda.bd;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import petagenda.exception.IllegalArgumentsException;

import petagenda.servico.TipoServico;

/** Representa a API principal do software com o driver do SGBD. Contém os 
 * métodos necessários para as operações de CRUD envolvendo as demais classes
 * do PetAgenda.
 *
 * @author Thiago M. Baiense
 */
public class BD {
    static final String SGBD = "mysql";
    static final String ADDRESS = "10.0.0.107";
    static final String PORT = "3306";
    static final String SCHEMA = "pet_agenda";
    static final String USER = "root";
    static final String USER_PWD = "tmb";
    
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
                        insert.setString(5, endereco.CIDADE);
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
        
        public static petagenda.servico.TipoServico[] parse(ResultSet rs) throws SQLException {
            if (rs == null) {
                throw new NullPointerException("ResultSet não pode ser null");
            }
            
            ArrayList<petagenda.servico.TipoServico> tList = new ArrayList<petagenda.servico.TipoServico>();
            while (rs.next()) {
                petagenda.servico.TipoServico tipo;
                String nome;
                int id;
                
                id = rs.getInt("id");
                nome = rs.getString("nome");
                
                tipo = new petagenda.servico.TipoServico(id, nome);
                tList.add(tipo);
            }
            if (tList.size() > 0) {
                petagenda.servico.TipoServico[] tipos = new petagenda.servico.TipoServico[tList.size()];
                tList.toArray(tipos);
                return tipos;
            }
            
            return null;
        }
    }
}
