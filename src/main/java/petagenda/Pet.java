package petagenda;

//import java.util.Arrays;
import petagenda.dados.Endereco;
import petagenda.exception.*;
import petagenda.dados.Sexo;
//import petagenda.servico.Servico;
//import petagenda.servico.TipoServico;

/**
 *
 * @author thiago
 */
public final class Pet {
    private int id;
    private String nome;
    private Cliente dono;
    private String cor;
    private String raca;
    private Sexo sexo;
    private String porte;
    private String comportamento;
    private boolean eCastrado;
    private String caminhoCartaoVacinacao;
    private String estadoSaude;
    
    // Exemplo de uso
//    public static void main(String[] args) {
//        try {
//            Endereco vitoria = new Endereco("rua vila boa", "numero 100", "itaparica", "vitoria", "12345678");
//            
//            TipoServico passeio = new TipoServico("Passeio");
//            Servico dogwalker = new Servico("DogWalker", passeio, 60, 100.99);
//            
//            Cliente maria = new Cliente("Maria", vitoria, "40028922", dogwalker);
//            System.out.println(maria.toString());
//        } catch (IllegalArgumentsException exs) {
//            Throwable[] causes = exs.getCauses(); 
//            System.out.println(Arrays.toString(causes));
//        }
//    }
    
    public Pet(String nome, Cliente dono, String raca, Sexo sexo, boolean eCastrado) {
        this(1, nome, dono, raca, sexo, eCastrado);
        this.id = -1;
    }
    
    public Pet(int id, String nome, Cliente dono, String raca, Sexo sexo, boolean eCastrado) {
        IllegalArgumentsException exs = new IllegalArgumentsException();
        
        try {
            setId(id);
        } catch (IllegalIdException ex) {
            exs.addCause(ex);
        }
        
        try {
            setNome(nome);
        } catch (IllegalNomeException ex) {
            exs.addCause(ex);
        }
        
        try {
            setDono(dono);
        } catch (IllegalClienteException ex) {
            exs.addCause(ex);
        }
        
        try {
            setRaca(raca);
        } catch (IllegalRacaException ex) {
            exs.addCause(ex);
        }
        
        try {
            setSexo(sexo);
        } catch (IllegalSexoException ex) {
            exs.addCause(ex);
        }
        
        setCastrado(eCastrado);
        
        if (exs.size() > 0) {
            throw exs;
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
        } else {
            nome = nome.trim();
            if (nome.isEmpty()) {
                throw new IllegalNomeException("nome não pode ser vazio");
            } else if (nome.length() > 45) {
                throw new IllegalNomeException("nome não pode conter mais do que 45 caracteres");
            }
            this.nome = nome;
        }
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setDono(Cliente dono) {
        if (dono == null) {
            throw new IllegalClienteException("cliente não pode ser nulo");
        } else {
            this.dono = dono;
        }
    }
    
    public Cliente getDono() {
        return this.dono;
    }
    
    public void setCor(String cor) {
        if (cor == null) {
//            throw new IllegalNomeException("cor não pode ser nulo");
            this.cor = null;
        } else {
            cor = cor.trim();
            if (cor.isEmpty()) {
//                throw new IllegalNomeException("cor não pode ser vazia");
                this.cor = null;
            } else if (cor.length() > 16) {
                throw new IllegalNomeException("cor não pode conter mais do que 16 caracteres");
            }
            this.cor = cor;
        }
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public Endereco getEndereco() {
        return this.getDono().getEndereco();
    }
    
    public void setRaca(String raca){
        if (raca == null) {
            throw new IllegalNomeException("raça não pode ser nula");
        }
        raca = raca.trim();
        if (raca.isEmpty()) {
            throw new IllegalNomeException("raça não pode ser vazia");
        } else if (raca.length() > 45) {
            throw new IllegalNomeException("raça não pode conter mais do que 45 caracteres");
        }
        this.raca = raca;
    }
    
    public String getRaca() {
        return this.raca;
    }
    
    public void setSexo(Sexo sexo) {
        if (sexo == null) {
            throw new IllegalSexoException("sexo não pode ser nulo");
        } else {
            this.sexo = sexo;
        }
    }
    
    public Sexo getSexo() {
        return this.sexo;
    }
    
    public void setCastrado(boolean eCastrado) {
        this.eCastrado = eCastrado;
    }
    
    public boolean getECastrado() {
        return this.eCastrado;
    }
    
    public void setPorte(String porte) {
        if (porte == null) {
//            throw new IllegalNomeException("porte não pode ser nulo");
            this.porte = null;
        } else {
            porte = porte.trim();
            if (porte.isEmpty()) {
//                throw new IllegalNomeException("porte não pode ser vazia");
                this.porte = null;
            } else if (porte.length() > 16) {
                throw new IllegalNomeException("porte não pode conter mais do que 20 caracteres");
            }
            this.porte = porte;
        }
    }
    
    public String getPorte() {
        return this.porte;
    }
    
    public void setComportamento(String comportamento) {
        if (comportamento == null) {
//            throw new IllegalNomeException("comportamento não pode ser nulo");
            this.comportamento = null;
        } else {
            comportamento = comportamento.trim();
            if (comportamento.isEmpty()) {
//                throw new IllegalNomeException("comportamento não pode ser vazia");
                this.comportamento = null;
            } else if (comportamento.length() > 80) {
                throw new IllegalNomeException("comportamento não pode conter mais do que 80 caracteres");
            }
            this.comportamento = comportamento;
        }
    }
    
    public String getComportamento() {
        return this.comportamento;
    }
    
    public void setCaminhoCartaoVacinacao(String caminho) {
        if (caminho == null) {
//            throw new IllegalCaminhoCartaoVacinacaoException("caminho do cartão de vacinação não pode ser nulo");
            this.caminhoCartaoVacinacao = null;
        } else {
            caminho = caminho.trim();
            if (caminho.isEmpty()) {
//                throw new IllegalCaminhoCartaoVacinacaoException("caminho do cartão de vacinação não pode ser vazia");
                this.caminhoCartaoVacinacao = null;
            } else if (caminho.length() > 255) {
                throw new IllegalCaminhoCartaoVacinacaoException("caminho do cartão de vacinação não pode conter mais do que 255 caracteres");
            }
            this.caminhoCartaoVacinacao = caminho;
        }
    }
    
    public String getCaminhoCartaoVacinacao() {
        return this.caminhoCartaoVacinacao;
    }
    
    public void setEstadoSaude(String estado) {
        if (estado == null) {
//            throw new IllegalNomeException("estado de saúde não pode ser nulo");
            this.estadoSaude = null;
        } else {
            estado = estado.trim();
            if (estado.isEmpty()) {
//                throw new IllegalNomeException("estado de saúde não pode ser vazia");
                this.estadoSaude = null;
            } else if (estado.length() > 255) {
                throw new IllegalNomeException("estado de saúde não pode conter mais do que 255 caracteres");
            }
            this.estadoSaude = estado;
        }
    }
    
    public String getEstadoSaude() {
        return this.estadoSaude;
    }
    
    
    @Override
    public String toString() {
        return String.format("NOME: %s | DONO: %s | RAÇA: %s | SEXO: %s | É CASTRADO: %s", getNome(), getDono().getNome(), getRaca(), getSexo().PET, ((getECastrado()) ? "SIM" : "NÃO"));
    }
}
