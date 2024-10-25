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
public class Endereco {
    private int id;
    public final String RUA;
    public final String NUMERO;
    public final String BAIRRO;
    public final String CIDADE;
    public final String CEP;
    
    public Endereco(String rua, String numero, String bairro, String cidade) {
        this(1, rua, numero, bairro, cidade, null);
        this.id = -1;
    }
    
    public Endereco(String rua, String numero, String bairro, String cidade, String cep) {
        this(1, rua, numero, bairro, cidade, cep);
        this.id = -1;
    }
    
    public Endereco(int id, String rua, String numero, String bairro, String cidade, String cep){
        ArrayList<Throwable> tList = null;
        
        // Validação de id
        try {
            setId(id);
        } catch (IllegalIdException ex) {
            tList = new ArrayList<Throwable>();
            tList.add(ex);
        }
        
        // Validação de rua
        if (rua == null) {
            if (tList == null) {
                tList = new ArrayList<Throwable>();
            }
            tList.add(new IllegalRuaException("rua não pode ser nulo"));
        } else {
            rua = rua.trim();
            
            if (rua.isEmpty()) {
                if (tList == null) {
                    tList = new ArrayList<Throwable>();
                }
                tList.add(new IllegalRuaException("rua não pode ser vazio")); 
            } else if (rua.length() > 45) {
                if (tList == null) {
                    tList = new ArrayList<Throwable>();
                }
                tList.add(new IllegalRuaException("rua não pode mais do que 45 caracteres"));
            }
        }
        
        //Validação de numero
        if (numero == null) {
            if (tList == null) {
                tList = new ArrayList<Throwable>();
            }
            tList.add(new IllegalNumeroException("número não pode ser nulo"));
        } else {
            numero = numero.trim();
            
            if (numero.isEmpty()) {
                if (tList == null) {
                    tList = new ArrayList<Throwable>();
                }
                tList.add(new IllegalNumeroException("número não pode ser vazio")); 
            } else if (numero.length() > 16) {
                if (tList == null) {
                    tList = new ArrayList<Throwable>();
                }
                tList.add(new IllegalNumeroException("número não pode mais do que 16 caracteres"));
            }
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
            } else if (bairro.length() > 32) {
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
            } else if (cidade.length() > 32) {
                if (tList == null) {
                    tList = new ArrayList<Throwable>();
                }
                tList.add(new IllegalCidadeException("cidade não pode mais do que 32 caracteres"));
            }
        }
        
        //Validação de CEP
        if (cep == null) {
//            if (tList == null) {
//                tList = new ArrayList<Throwable>();
//            }
//            tList.add(new IllegalCepException("CEP não pode ser nulo"));
        } else {
            cep = cep.trim();
            
            if (cep.isEmpty()) {
//                if (tList == null) {
//                    tList = new ArrayList<Throwable>();
//                }
//                tList.add(new IllegalCepException("CEP não pode ser vazio"));
                cep = null;
            } else if (cep.length() > 32) {
                if (tList == null) {
                    tList = new ArrayList<Throwable>();
                }
                tList.add(new IllegalCepException("CEP não pode conter mais do que 8 caracteres"));
            } else if (cep.length() < 8) {
                if (tList == null) {
                    tList = new ArrayList<Throwable>();
                }
                tList.add(new IllegalCepException("CEP não pode conter menos do que 8 caracteres"));
            }
        }
        
        if (tList == null) { // Se nenhum dado foi inválido
            this.id = id;
            this.RUA = rua;
            this.BAIRRO = bairro;
            this.NUMERO = numero;
            this.CIDADE = cidade;
            this.CEP = cep;
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
    
    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", RUA, NUMERO, BAIRRO, CIDADE, CEP);
    }
}
