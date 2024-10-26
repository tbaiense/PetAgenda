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
public class LocalAtuacao {
    
    private int id;
    public final String BAIRRO;
    public final String CIDADE;
    
    public LocalAtuacao(String bairro, String cidade) {
        this(1, bairro, cidade);
        this.id = -1;
    }
    
    public LocalAtuacao(int id, String bairro, String cidade) {
        ArrayList<Throwable> tList = null;
        
        // Validação de id
        try {
            setId(id);
        } catch (IllegalIdException ex) {
            tList = new ArrayList<Throwable>();
            tList.add(ex);
        }
        
        //Validação de bairro
        if (bairro == null) {
            if (tList == null) {
                tList = new ArrayList<Throwable>();
            }
            tList.add(new IllegalBairroException("bairro não pode ser nulo"));
        } else {
            bairro = bairro.trim();
            
            if (bairro.isEmpty()) {
                if (tList == null) {
                    tList = new ArrayList<Throwable>();
                }
                tList.add(new IllegalBairroException("bairro não pode ser vazio")); 
            } else if (bairro.length() > 45) {
                if (tList == null) {
                    tList = new ArrayList<Throwable>();
                }
                tList.add(new IllegalBairroException("bairro não pode mais do que 32 caracteres"));
            }
        }
        
        
        //Validação de cidade
        if (cidade == null) {
            if (tList == null) {
                tList = new ArrayList<Throwable>();
            }
            tList.add(new IllegalCidadeException("cidade não pode ser nulo"));
        } else {
            cidade = cidade.trim();
            
            if (cidade.isEmpty()) {
                if (tList == null) {
                    tList = new ArrayList<Throwable>();
                }
                tList.add(new IllegalCidadeException("cidade não pode ser vazio")); 
            } else if (cidade.length() > 45) {
                if (tList == null) {
                    tList = new ArrayList<Throwable>();
                }
                tList.add(new IllegalCidadeException("cidade não pode mais do que 32 caracteres"));
            }
        }
        
        if (tList == null) { // Se nenhum dado foi inválido
            this.id = id;
            this.BAIRRO = bairro;
            this.CIDADE = cidade;
        } else {
            Throwable[] tArray = new Throwable[tList.size()];
            tList.toArray(tArray);
            throw new IllegalArgumentsException("um ou mais argumentos fornecidos são inválidos", tArray);
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
