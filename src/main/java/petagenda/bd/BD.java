package petagenda.bd;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    static public class TipoServico {
        static final String TABLE = "tipo_servico";
        
        public static petagenda.servico.TipoServico[] selectAll() {
            try {
                Connection conn = BD.getConnection();
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
