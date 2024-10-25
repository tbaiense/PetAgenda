package petagenda;

import petagenda.exception.IllegalEnderecoException;
import java.util.ArrayList;
import java.util.Arrays;
import petagenda.dados.CPF;
import petagenda.dados.Endereco;
import petagenda.dados.LocalAtuacao;
import petagenda.dados.Permissao;
import petagenda.exception.IllegalArgumentsException;
import petagenda.exception.IllegalCpfException;
import petagenda.exception.IllegalIdException;
import petagenda.exception.IllegalLocalAtuacaoException;
import petagenda.exception.IllegalNomeException;
import petagenda.exception.IllegalPermissaoException;
import petagenda.exception.IllegalSenhaException;
import petagenda.exception.IllegalServicoException;
import petagenda.exception.IllegalTelefoneException;
import petagenda.servico.Servico;
import petagenda.servico.TipoServico;

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
    
    // Exemplo de uso
    public static void main(String[] args) {
        Cliente eu;
        try {
            TipoServico passeio = new TipoServico("Passeio");
            Servico servSolicita = new Servico("Dog Walker", passeio, 60, 100.0);
            Endereco endCliente = new Endereco("Rua Guanabara", "num. 106", "Itaparica", "Vitoria");
            
            Cliente cl = new Cliente("Roberto", endCliente, "4002-8922", servSolicita);
            System.out.println(cl.toString());
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
        this.id = -1;
    }
    
    public Cliente(String nome, Endereco endereco, String cpf, String telefone, Servico servicoSolicita, String buscarPetCom, String devolverPetPara) {
        this(1, nome, endereco, cpf, telefone, servicoSolicita, buscarPetCom, devolverPetPara);
        this.id = -1;
    }
    
    public Cliente(int id, String nome, Endereco endereco, String cpf, String telefone, Servico servicoSolicita, String buscarPetCom, String devolverPetPara) {
        ArrayList<Throwable> tList = null;
        
        // Id
        try {
            setId(id);
        } catch (IllegalIdException ex) {
            tList = new ArrayList<Throwable>();
            tList.add(ex);
        }
        
        // Nome
        try {
            setNome(nome);
        } catch (IllegalNomeException ex) {
            if (tList == null) {
                tList = new ArrayList<Throwable>(); 
            }
            tList.add(ex);
        }
        
        // Endereço
        try {
            setEndereco(endereco);
        } catch (IllegalEnderecoException ex) {
            if (tList == null) {
                tList = new ArrayList<Throwable>(); 
            }
            tList.add(ex);
        }
        
        // CPF
        try {
            setCpf(cpf);
        } catch (IllegalCpfException ex) {
            if (tList == null) {
                tList = new ArrayList<Throwable>(); 
            }
            tList.add(ex);
        }
        
        // Telefone
        try {
            setTelefone(telefone);
        } catch (IllegalTelefoneException ex) {
            if (tList == null) {
                tList = new ArrayList<Throwable>(); 
            }
            tList.add(ex);
        }
        
        // Serviço solicitado
        try {
            setServico(servicoSolicita);
        } catch (IllegalServicoException ex) {
            if (tList == null) {
                tList = new ArrayList<Throwable>(); 
            }
            tList.add(ex);
        }
        
        // Pessoa com quem buscar o Pet
        try {
            setBuscarPetCom(buscarPetCom);
        } catch (IllegalNomeException ex) {
            if (tList == null) {
                tList = new ArrayList<Throwable>(); 
            }
            tList.add(ex);
        }
        
        // Pessoa a quem o Pet deve ser devolvido
        try {
            setDevolverPetPara(devolverPetPara);
        } catch (IllegalNomeException ex) {
            if (tList == null) {
                tList = new ArrayList<Throwable>(); 
            }
            tList.add(ex);
        }
        
        if (tList != null) { // Alguma exceção ocorreu
            throw new IllegalArgumentsException(tList.toArray(new Throwable[tList.size()]));
        }
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
            this.nome = pessoa;
        }
    }
    
    public String setDevolverPetPara() {
        return this.buscarPetCom;
    }
    @Override
    public String toString() {
        return String.format("NOME: %s | ENDERECO: %s | TELEFONE: %s | SERVIÇO SOL.: %s", getNome(), getEndereco().toString(), getTelefone(), getServico().getNome());
    }
}
