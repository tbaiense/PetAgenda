package petagenda.dados;

import java.util.ArrayList;
import petagenda.exception.IllegalArgumentsException;
import petagenda.exception.IllegalIdException;
import petagenda.exception.IllegalNomeException;

/**
 *
 * @author t.baiense
 */
public class Permissao {
    private int id;
    public final String nome;
    
    public Permissao(String nome) {
        this(1, nome);
        this.id = -1;
    }
    
    public Permissao(int id, String nome) {
        ArrayList<Throwable> tList = null;
        IllegalArgumentsException exs;
        
        try {
            setId(id);
        } catch (IllegalIdException ex) {
            tList = new ArrayList<Throwable>();
            tList.add(ex);
        }
        
        if (nome == null) {
            if (tList == null) {
                tList = new ArrayList<Throwable>();
            }
            tList.add(new IllegalNomeException("nome não pode ser nulo"));
        } else {
            nome = nome.trim();
            
            if (nome.isEmpty()) {
                if (tList == null) {
                    tList = new ArrayList<Throwable>();
                }
                tList.add(new IllegalNomeException("nome não pode ser vazio"));
            }
        }
        
        if (tList == null) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentsException(tList.toArray(new Throwable[tList.size()]));
        }
    }
    
    public void setId(int id) {
        if (id < 0) {
            throw new IllegalIdException("id não pode ser inferior a 0");
        } else {
            this.id = id;
        }
    }
    
    public int getId() {
        return this.id;
    }
}
