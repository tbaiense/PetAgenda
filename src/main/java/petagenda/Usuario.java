package petagenda;

import java.util.ArrayList;
import petagenda.dados.Endereco;
import petagenda.dados.LocalAtuacao;
import petagenda.dados.Permissao;
import petagenda.exception.IllegalArgumentsException;
import petagenda.exception.IllegalIdException;
import petagenda.exception.IllegalNomeException;
import petagenda.exception.IllegalPermissaoException;
import petagenda.exception.IllegalSenhaException;
import petagenda.servico.Servico;

/**
 *
 * @author t.baiense
 */
public class Usuario {
    private int id;
    private String nome;
    private Endereco endereco;
    private String cpf;
    private String telefone;
    private String senha;
    private Servico servicoPresta;
    private Permissao permissao;
    private LocalAtuacao localAtuacao;
    
    public Usuario(int id, String nome, Endereco endereco, String cpf, String telefone, Servico servicoPresta, LocalAtuacao localAtuacao) {
        ArrayList<Throwable> tList = null;
        IllegalArgumentsException exs;
        
        try {
            setId(id);
        } catch (IllegalIdException ex) {
            tList = new ArrayList<Throwable>();
            tList.add(ex);
        }
        
//        CONTINUAR
//        try {
//            if (nome == null) {
//                throw new IllegalNomeException("nome não pode ser nulo");
//            }
//            nome = nome.trim();
//            
//        } catch (IllegalNomeException ex) {
//            if (tList == null) {
//                tList = new ArrayList<Throwable>(); 
//            }
//            tList.add(ex);
//        }
        
    }
    
    public void setId(int id) {
        if (id < 0) {
            throw new IllegalIdException("id não pode ser inferior a zero");
        }
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public Endereco getEndereco() {
        return this.endereco;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setPermissao(Permissao permissao) {
        if (permissao == null) {
          throw new IllegalPermissaoException("permissão não pode ser nula");  
        }
        this.permissao = permissao;
    }
    
    public Permissao getPermissao() {
        return this.permissao;
    }
    
    public void setSenha(String senha) {
        if (senha == null) {
            throw new IllegalSenhaException("senha não pode ser nula");
        }
        senha = senha.trim();

        if (senha.isEmpty()) {
            throw new IllegalSenhaException("senha não pode ser vazia");
        } 
        
        if (senha.length() > 32) {
            throw new IllegalSenhaException("senha não pode conter mais do que 32 caracteres");
        }
        
        this.senha = senha;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public Servico getServico() {
        return this.servicoPresta;
    }
    
    public LocalAtuacao getLocalAtuacao() {
        return this.localAtuacao;
    }
}
