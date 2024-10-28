package petagenda.dados;

import java.util.ArrayList;

import petagenda.exception.IllegalArgumentsException;
import petagenda.exception.IllegalIdException;
import petagenda.exception.IllegalRuaException;
import petagenda.exception.IllegalNumeroException;
import petagenda.exception.IllegalBairroException;
import petagenda.exception.IllegalCidadeException;
import petagenda.exception.IllegalCepException;

/** Representa a informação de endereço de um usuário ou cliente
 *
 * @author Thiago M. Baiense
 */
public final class Endereco {
    private int id;
    public final String RUA;
    public final String NUMERO;
    public final String BAIRRO;
    public final String CIDADE;
    public final String CEP;
    public static final int NULL_ID = -1;
    
    public Endereco(String rua, String numero, String bairro, String cidade, String cep) {
        this(1, rua, numero, bairro, cidade, cep);
        this.id = NULL_ID;
    }
    
    public Endereco(int id, String rua, String numero, String bairro, String cidade, String cep){
        IllegalArgumentsException exs = new IllegalArgumentsException();
        
        // Validação de id
        try {
            setId(id);
        } catch (IllegalIdException ex) {
            exs.addCause(ex);
        }
        
        // Validação de rua
        if (rua == null) {
            exs.addCause(new IllegalRuaException("rua não pode ser nulo"));
        } else {
            rua = rua.trim();
            if (rua.isEmpty()) {
                exs.addCause(new IllegalRuaException("rua não pode ser vazio")); 
            } else if (rua.length() > 45) {
                exs.addCause(new IllegalRuaException("rua não pode mais do que 45 caracteres"));
            }
        }
        
        //Validação de numero
        if (numero == null) {
            exs.addCause(new IllegalNumeroException("número não pode ser nulo"));
        } else {
            numero = numero.trim();
            if (numero.isEmpty()) {
                exs.addCause(new IllegalNumeroException("número não pode ser vazio")); 
            } else if (numero.length() > 16) {
                exs.addCause(new IllegalNumeroException("número não pode mais do que 16 caracteres"));
            }
        }
        
        //Validação de bairro
        if (bairro == null) {
            exs.addCause(new IllegalBairroException("bairro não pode ser nulo"));
        } else {
            bairro = bairro.trim();
            if (bairro.isEmpty()) {
                exs.addCause(new IllegalBairroException("bairro não pode ser vazio")); 
            } else if (bairro.length() > 32) {
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
            } else if (cidade.length() > 32) {
                exs.addCause(new IllegalCidadeException("cidade não pode mais do que 32 caracteres"));
            }
        }
        
        //Validação de CEP
        if (cep == null) {
            exs.addCause(new IllegalCepException("CEP não pode ser nulo"));
        } else {
            cep = cep.trim();
            
            if (cep.isEmpty()) {
                exs.addCause(new IllegalCepException("CEP não pode ser vazio"));
                cep = null;
            } else if (cep.length() > 8) {
                exs.addCause(new IllegalCepException("CEP não pode conter mais do que 8 caracteres"));
            } else if (cep.length() < 8) {
                exs.addCause(new IllegalCepException("CEP não pode conter menos do que 8 caracteres"));
            }
        }
        
        if (exs.size() > 0) { 
            throw exs;
        } else { // Se nenhum dado foi inválido
            this.id = id;
            this.RUA = rua;
            this.BAIRRO = bairro;
            this.NUMERO = numero;
            this.CIDADE = cidade;
            this.CEP = cep;
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
    
    @Override
    public String toString() {
        StringBuilder endStr = new StringBuilder();
        
        endStr.append(String.format("%s, %s, %s, %s", this.RUA, this.NUMERO, this.BAIRRO, this.CIDADE));
        if (this.CEP != null) {
            endStr.append(String.format(" (CEP: %s)", this.CEP));
        };
        
        return endStr.toString();
    }
}
