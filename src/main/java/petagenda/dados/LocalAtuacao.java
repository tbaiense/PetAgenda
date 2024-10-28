package petagenda.dados;

import java.util.ArrayList;
import petagenda.exception.IllegalArgumentsException;
import petagenda.exception.IllegalBairroException;
import petagenda.exception.IllegalCidadeException;
import petagenda.exception.IllegalIdException;

/**
 *
 * @author t.baiense
 */
public final class LocalAtuacao {
    
    private int id;
    public final String BAIRRO;
    public final String CIDADE;
    public static final int NULL_ID = -1;
    public LocalAtuacao(String bairro, String cidade) {
        this(1, bairro, cidade);
        this.id = NULL_ID;
    }
    
    public LocalAtuacao(int id, String bairro, String cidade) {
        IllegalArgumentsException exs = new IllegalArgumentsException();
        
        // Validação de id
        try {
            setId(id);
        } catch (IllegalIdException ex) {
            exs.addCause(ex);
        }
        
        //Validação de bairro
        if (bairro == null) {
            exs.addCause(new IllegalBairroException("bairro não pode ser nulo"));
        } else {
            bairro = bairro.trim();
            if (bairro.isEmpty()) {
                exs.addCause(new IllegalBairroException("bairro não pode ser vazio")); 
            } else if (bairro.length() > 45) {
                exs.addCause(new IllegalBairroException("bairro não pode mais do que 32 caracteres"));
            }
        }
        
        //Validação de cidade
        if (cidade == null) {
            exs.addCause(new IllegalCidadeException("cidade não pode ser nulo"));
        } else {
            cidade = cidade.trim();
            if (cidade.isEmpty()) {
                exs.addCause(new IllegalCidadeException("cidade não pode ser vazio")); 
            } else if (cidade.length() > 45) {
                exs.addCause(new IllegalCidadeException("cidade não pode mais do que 32 caracteres"));
            }
        }
        
        if (exs.size() > 0) { 
            throw exs;
        } else { // Se nenhum dado foi inválido
            this.id = id;
            this.BAIRRO = bairro;
            this.CIDADE = cidade;
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
    
    public static LocalAtuacao valueOf(Endereco endereco) {
        if (endereco == null) {
            throw new NullPointerException("endereco não pode ser nulo");
        } else {
            return new LocalAtuacao(endereco.BAIRRO, endereco.CIDADE);
        }
    }
    
    @Override
    public String toString() {
        return String.format("%s, %s", this.BAIRRO, this.CIDADE);
    }
}
