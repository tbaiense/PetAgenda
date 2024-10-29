package petagenda;

import java.util.ArrayList;
//import java.util.Arrays;
import petagenda.dados.*;
import petagenda.exception.*;
import petagenda.servico.Servico;
//import petagenda.servico.TipoServico;

/**
 *
 * @author t.baiense
 */
public final class Usuario {
    private int id;
    private String nome;
    private Endereco endereco;
    private CPF cpf;
    private String telefone;
    private String senha;
    private Servico servicoPresta;
    private Permissao permissao;
    private LocalAtuacao localAtuacao;
    
    public static final int NULL_ID = -1;
    
    // Exemplo de uso
//    public static void main(String[] args) {
//        Usuario eu;
//        try {
//            TipoServico passeio = new TipoServico("Passeio");
//            Servico servicoPresta = new Servico("Dog Walking", passeio, 60, 100.0);
//            LocalAtuacao local = new LocalAtuacao("Itaparica", "Vitória");
//            Endereco end = new Endereco("Rua tal", "numero 5", "Bairro legal", "Cidade bacana");
//            eu = new Usuario("Thiago", end, "887.844.490-12", "40028922", servicoPresta, local);
//            System.out.println(eu);
//        } catch (IllegalArgumentsException exs) {
//            Throwable[] causas = exs.getCauses(); // Exceções geradas pelo construtor por conta de argumentos inválidos
//            System.out.println(Arrays.toString(causas)); // Printa as exceções se houver
//        }
//        
//    }
    
    
    public Usuario(String nome, Endereco endereco, String cpf, String telefone, Servico servicoPresta, LocalAtuacao localAtuacao) {
        this(1, nome, endereco, cpf, telefone, servicoPresta, localAtuacao );
        this.id = NULL_ID;
    }
    
    public Usuario(int id, String nome, Endereco endereco, String cpf, String telefone, Servico servicoPresta, LocalAtuacao localAtuacao) {
        IllegalArgumentsException exs = new IllegalArgumentsException();
        
        // Id
        try {
            setId(id);
        } catch (IllegalIdException ex) {
            exs.addCause(ex);
        }
        
        // Nome
        try {
            setNome(nome);
        } catch (IllegalNomeException ex) {
            exs.addCause(ex);
        }
        
        // Endereço
        try {
            setEndereco(endereco);
        } catch (IllegalEnderecoException ex) {
            exs.addCause(ex);
        }
        
        // CPF
        try {
            setCpf(cpf);
        } catch (IllegalCpfException ex) {
            exs.addCause(ex);
        }
        
        // Telefone
        try {
            setTelefone(telefone);
        } catch (IllegalTelefoneException ex) {
            exs.addCause(ex);
        }
        
        // Serviço prestado
        try {
            setServico(servicoPresta);
        } catch (IllegalServicoException ex) {
            exs.addCause(ex);
        }
        
        // Local de atuação
        try {
            setLocalAtuacao(localAtuacao);
        } catch (IllegalLocalAtuacaoException ex) {
            exs.addCause(ex);
        }
        
        if (exs.size() > 0) { // Alguma exceção ocorreu
            throw exs;
        }
    }
    
    public boolean isNew() {
        return this.getId() == NULL_ID;
    }
    
    public void setId(int id) {
        if (id < 0) {
            throw new IllegalIdException("id não pode ser inferior a zero");
        } else {
            this.id = id;
        }
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalNomeException("nome não pode ser nulo");
        }
        nome = nome.trim();
        if (nome.isEmpty()) {
            throw new IllegalNomeException("nome não pode ser vazio");
        } else if (nome.length() > 64) {
            throw new IllegalNomeException("nome não pode conter mais do que 64 caracteres");
        }
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new IllegalEnderecoException("Endereço não pode ser nulo");
//            this.endereco = null;
        } else {
            this.endereco = endereco;
        }
    }
    
    public Endereco getEndereco() {
        return this.endereco;
    }
    
    public void setCpf(String strCpf) {
        if (strCpf == null) {
            this.setCpf((CPF)null); // Meus olhos choram sangue de ter que fazer isso (ಥ﹏ಥ) 
        } else {
            this.setCpf(new CPF(strCpf)); // Dá throw de IllegalCpfException se for inválido e NullPointerException se for nulo
        }
    }
    
    public void setCpf(CPF cpf) {
        if (cpf == null) {
            throw new IllegalCpfException("CPF não pode ser nulo");
//            this.cpf = null;
        } else {
            this.cpf = cpf;
        }
    }
    
    public void setTelefone(String tel) {
        if (tel == null) {
            throw new IllegalTelefoneException("telefone não pode ser nulo");
        }
        tel = tel.trim();
        if (tel.isEmpty()) {
            throw new IllegalTelefoneException("telefone não pode ser vazio");
        } else if (tel.length() > 12) {
            throw new IllegalTelefoneException("telefone não pode conter mais do que 12 caracteres");
        }
        this.telefone = tel;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setPermissao(Permissao permissao) {
        if (permissao == null) {
//          throw new IllegalPermissaoException("permissão não pode ser nula"); /* Não é necessário pois coluna permissao não tem restrição de NOT NULL no BD*/
            this.permissao = null;
        } else {
            this.permissao = permissao;
        }
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
    
    public CPF getCpf() {
        return this.cpf;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public void setServico(Servico servico) {
        if (servico == null) {
            throw new IllegalServicoException("serviço não pode ser nulo");
        } else {
            this.servicoPresta = servico;
        }
    }
    
    public Servico getServico() {
        return this.servicoPresta;
    }
    
    public void setLocalAtuacao(LocalAtuacao local) {
        if (local == null) {
            throw new IllegalLocalAtuacaoException("local de atuação não pode ser nulo");
        } else {
            this.localAtuacao = local;
        }
    }
    
    public LocalAtuacao getLocalAtuacao() {
        return this.localAtuacao;
    }
    
    @Override
    public String toString() {
        return String.format("NOME: %s | TEL: %s | SERV. PRESTA: %s | LOCAL ATUAÇÃO: %s", getNome(), getTelefone(), getServico().getNome(), getLocalAtuacao().toString());
    }
}
