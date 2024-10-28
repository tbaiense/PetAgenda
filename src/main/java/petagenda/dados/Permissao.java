package petagenda.dados;

import java.util.ArrayList;
import petagenda.exception.IllegalArgumentsException;
import petagenda.exception.IllegalIdException;
import petagenda.exception.IllegalNomeException;

/**
 *
 * @author t.baiense
 */
public final class Permissao {
    private int id;
    public final String nome;
    
    public static final int NULL_ID = -1;
    
    public Permissao(String nome) {
        this(1, nome);
        this.id = NULL_ID;
    }
    
    public Permissao(int id, String nome) {
        IllegalArgumentsException exs = new IllegalArgumentsException();
        
        try {
            setId(id);
        } catch (IllegalIdException ex) {
            exs.addCause(ex);
        }
        
        if (nome == null) {
            exs.addCause(new IllegalNomeException("nome não pode ser nulo"));
        } else {
            nome = nome.trim();
            if (nome.isEmpty()) {
                exs.addCause(new IllegalNomeException("nome não pode ser vazio"));
            }
        }
        
        if (exs.size() > 0) {
            throw exs;
        } else {
            this.nome = nome;
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
