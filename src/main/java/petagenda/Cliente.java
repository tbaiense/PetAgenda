package petagenda;

import petagenda.bd.BD;
import java.util.ArrayList;
import java.util.Arrays;
import petagenda.dados.*;
import petagenda.exception.*;
import petagenda.servico.*;

/**
 *
 * @author t.baiense
 */
public final class Cliente {
    private int id;
    private String nome;
    private Endereco endereco;
    private CPF cpf;
    private String telefone;
    private Servico servicoSolicita;
    private String buscarPetCom;
    private String devolverPetPara;
    
    public static final int NULL_ID = -1;
    
    // Exemplo de uso
    public static void main(String[] args) {
        Cliente eu;
        try {
//            TipoServico passeio = new TipoServico("Passeio");
//            Servico servSolicita = new Servico("Dog Walker", passeio, 60, 100.0);
//            Endereco endCliente = new Endereco("Rua Guanabara", "num. 106", "Itaparica", "Vitoria", "12345678");
            
//            Cliente cl = new Cliente("Roberto", endCliente, "4002-8922", servSolicita);
//            
            // Inserindo novo Cliente no banco
//            Endereco endCliente = new Endereco("Rua Guanabara", "num. 106", "Itaparica", "Vitoria", "12345678");
//            Servico servDogWalking = BD.Servico.selectById(4);
//            Cliente cl = new Cliente("Roberto", endCliente, "4002-8922", servDogWalking);
//            BD.Cliente.insert(cl);
//            System.out.println(BD.Cliente.selectById(BD.Cliente.selectLast().getId()).toString());

            // Alterando Cliente no banco
//            Cliente cl = BD.Cliente.selectLast();
//            Endereco novoEndCliente = new Endereco("Rua nova", "num. novo", "Bairro novo", "Cidade nova", "12345999");
//            Servico novoServCliente = BD.Servico.selectById(1);
//            cl.setEndereco(novoEndCliente);
//            cl.setServico(novoServCliente);
//            
//            BD.Cliente.update(cl);
//            System.out.println(BD.Cliente.selectById(BD.Cliente.selectLast().getId()).toString());

            // Apagando Cliente no banco
            Cliente lastClDelete = BD.Cliente.selectLast();
            System.out.println(BD.Cliente.delete(lastClDelete));

        } catch (IllegalArgumentsException exs) {
            Throwable[] causas = exs.getCauses(); // Exceções geradas pelo construtor por conta de argumentos inválidos
            System.out.println(Arrays.toString(causas)); // Printa as exceções se houver
        }
        
    }
    
    public Cliente(int id, String nome, Endereco endereco, String telefone, Servico servicoSolicita) {
        this(id, nome, endereco, null, telefone, servicoSolicita, null, null);
    }
    
    public Cliente(String nome, Endereco endereco, String telefone, Servico servicoSolicita) {
        this(1, nome, endereco, null, telefone, servicoSolicita, null, null);
        this.id = NULL_ID;
    }
    
    public Cliente(String nome, Endereco endereco, String cpf, String telefone, Servico servicoSolicita, String buscarPetCom, String devolverPetPara) {
        this(1, nome, endereco, cpf, telefone, servicoSolicita, buscarPetCom, devolverPetPara);
        this.id = NULL_ID;
    }
    
    public Cliente(int id, String nome, Endereco endereco, String cpf, String telefone, Servico servicoSolicita, String buscarPetCom, String devolverPetPara) {
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
        
        // Serviço solicitado
        try {
            setServico(servicoSolicita);
        } catch (IllegalServicoException ex) {
            exs.addCause(ex);
        }
        
        // Pessoa com quem buscar o Pet
        try {
            setBuscarPetCom(buscarPetCom);
        } catch (IllegalNomeException ex) {
            exs.addCause(ex);
        }
        
        // Pessoa a quem o Pet deve ser devolvido
        try {
            setDevolverPetPara(devolverPetPara);
        } catch (IllegalNomeException ex) {
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
//            throw new IllegalCpfException("CPF não pode ser nulo");
            this.cpf = null;
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
    
    public CPF getCpf() {
        return this.cpf;
    }
    
    public void setServico(Servico servico) {
        if (servico == null) {
            throw new IllegalServicoException("serviço não pode ser nulo");
        } else {
            this.servicoSolicita = servico;
        }
    }
    
    public Servico getServico() {
        return this.servicoSolicita;
    }
    
    public void setBuscarPetCom(String pessoa) {
        if (pessoa == null) {
//            throw new IllegalNomeException("pessoa não pode ser nulo");
            this.buscarPetCom = null;
        } else {
            pessoa = pessoa.trim();
            if (pessoa.isEmpty()) {
                throw new IllegalNomeException("pessoa não pode ser vazio");
            } else if (pessoa.length() > 64) {
                throw new IllegalNomeException("pessoa não pode conter mais do que 64 caracteres");
            }
            this.nome = pessoa;
        }
    }
    
    public String getBuscarPetCom() {
        return this.buscarPetCom;
    }
    
    public void setDevolverPetPara(String pessoa) {
        if (pessoa == null) {
//            throw new IllegalNomeException("pessoa não pode ser nulo");
            this.devolverPetPara = null;
        } else {
            pessoa = pessoa.trim();
            if (pessoa.isEmpty()) {
                throw new IllegalNomeException("pessoa não pode ser vazio");
            } else if (pessoa.length() > 64) {
                throw new IllegalNomeException("pessoa não pode conter mais do que 64 caracteres");
            }
            this.devolverPetPara = pessoa;
        }
    }
    
    public String getDevolverPetPara() {
        return this.devolverPetPara;
    }
    @Override
    public String toString() {
        return String.format("NOME: %s | ENDERECO: %s | TELEFONE: %s | SERVIÇO SOL.: %s", getNome(), getEndereco().toString(), getTelefone(), getServico().getNome());
    }
}
