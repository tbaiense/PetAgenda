package petagenda.bd;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de criação do PreparedStatement", JOptionPane.ERROR_MESSAGE);
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
        
//        public static petagenda.dados.Endereco selectLast() {
//            try {
//                Connection conn = BD.getConnection();
//                PreparedStatement select = conn.prepareStatement(String.format("SELECT id, nome, login, tipo FROM %s ORDER BY id DESC LIMIT 1", TABLE));
//
//                ResultSet rs = select.executeQuery();
//                petagenda.dados.Endereco[] usuarios = parse(rs);
//
//                select.close();
//                conn.close();
//
//                if (usuarios == null) {
//                    return null;
//                }
//
//                return usuarios[0];
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de busca", JOptionPane.ERROR_MESSAGE);
//            }
//            return null;
//        }
//        
//        public static petagenda.dados.Endereco[] selectAll() {
//            try {
//                Connection conn = BD.getConnection();
//                PreparedStatement select = conn.prepareStatement(String.format("SELECT id, nome, login, tipo FROM %s", TABLE));
//
//                ResultSet rs = select.executeQuery();
//                petagenda.dados.Endereco[] usuarios = parse(rs);
//
//                select.close();
//                conn.close();
//
//                if (usuarios == null) {
//                    return null;
//                }
//
//                return usuarios;
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de busca", JOptionPane.ERROR_MESSAGE);
//            }
//            return null;
//        }
//        
//        public static petagenda.dados.Endereco selectById(int id) {
//            if (id > 0) {
//                try {
//                    Connection conn = BD.getConnection();
//                    PreparedStatement select = conn.prepareStatement(String.format("SELECT id, nome, login, tipo FROM %s WHERE id = ?", TABLE));
//                    select.setInt(1, id);
//                    
//                    ResultSet rs = select.executeQuery();
//                    petagenda.dados.Endereco[] usuarios = parse(rs);
//                    
//                    select.close();
//                    conn.close();
//                    
//                    if (usuarios == null) {
//                        return null;
//                    }
//                    
//                    return usuarios[0];
//                } catch (SQLException e) {
//                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de busca", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//            return null;
//        }
//        
//        public static petagenda.dados.Endereco[] parse(ResultSet rs) {
//            ArrayList<petagenda.dados.Endereco> uList = new ArrayList<petagenda.dados.Endereco>();
//            
//            try {
//                while (rs.next()) {
//                    int id;
//                    String nome, login;
//                    petagenda.dados.Endereco.Tipo tipo;
//                    petagenda.dados.Endereco usuario;
//                    
//                    id = rs.getInt(1);
//                    nome = rs.getString(2);
//                    login = rs.getString(3);
//                    tipo = petagenda.dados.Endereco.getTipo(rs.getString(4));
//                    
//                    usuario = new petagenda.dados.Endereco(id, nome, login, tipo);
//                    
//                    uList.add(usuario);
//                }
//                
//                if (uList.isEmpty()) {
//                    return null;
//                }
//                
//                petagenda.dados.Endereco[] usuarios = new petagenda.dados.Endereco[uList.size()];
//                uList.toArray(usuarios);
//                
//                return usuarios;
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de parse", JOptionPane.ERROR_MESSAGE);
//            }
//            
//            return null;
//        }
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
