package petagenda.servico;

import petagenda.exception.IllegalArgumentsException;
import petagenda.exception.IllegalDuracaoException;
import petagenda.exception.IllegalIdException;
import petagenda.exception.IllegalNomeException;
import petagenda.exception.IllegalPrecoException;
import petagenda.exception.IllegalTipoServicoException;
import petagenda.exception.IllegalDescricaoException;

import java.util.ArrayList;

/**
 *
 * @author Thiago M. Baiense
 */
public final class Servico {
    private int id;
    private String nome;
    private TipoServico tipo;
    private int duracao;
    private double preco;
    private String descricao;
    
    public Servico() {
        this.id = -1;
    }
    
    public Servico(int id, String nome, TipoServico tipo, int duracao, double preco, String descricao) throws IllegalArgumentsException {
        ArrayList<Throwable> cList = null; // Armazena as cause a serem adicionadas ao construtor
        
        try {
            this.setId(id);
        } catch (IllegalIdException ex) {
            cList = new ArrayList<Throwable>();
            cList.add(ex);
        }
        
        try {
            this.setNome(nome);
        } catch (IllegalNomeException ex) {
            if (cList == null) {
                cList = new ArrayList<Throwable>();
            }
            cList.add(ex);
        }
        
        try {
            this.setTipo(tipo);
        } catch (IllegalTipoServicoException ex) {
            if (cList == null) {
                cList = new ArrayList<Throwable>();
            }
            cList.add(ex);
        }
        
        try {
            this.setDuracao(duracao);
        } catch (IllegalDuracaoException ex) {
            if (cList == null) {
                cList = new ArrayList<Throwable>();
            }
            cList.add(ex);
        }
        
        try {
            this.setPreco(preco);
        } catch (IllegalPrecoException ex) {
            if (cList == null) {
                cList = new ArrayList<Throwable>();
            }
            cList.add(ex);
        }
        
        try {
            this.setDescricao(descricao);
        } catch (IllegalDescricaoException ex) {
            if (cList == null) {
                cList = new ArrayList<Throwable>();
            }
            cList.add(ex);
        }
        
        if (cList != null && !cList.isEmpty()) {
            Throwable[] tArray = new Throwable[cList.size()];
            cList.toArray(tArray);
            throw new IllegalArgumentsException(tArray);
        }
    }
    
    public Servico(String nome, TipoServico tipo, int duracao, double preco, String descricao) throws IllegalArgumentsException {
        this(1, nome, tipo, duracao, preco, descricao);
        this.id = -1;
    }
    
    public void setId(int id) throws IllegalIdException {
        if (id < 1) {
            throw new IllegalIdException();
        }
        
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setNome(String nome) throws IllegalNomeException {
        if (nome == null) {
            throw new IllegalNomeException("nome não pode ser nulo");
        }
        
        nome = nome.trim();
        
        if (nome.isEmpty()) {
            throw new IllegalNomeException("nome não pode ser vazio");
        } else if (nome.length() > 45) {
            throw new IllegalNomeException("nome não pode conter mais de 45 caracteres");
        }
        
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setTipo(TipoServico t) throws IllegalTipoServicoException {
        if (t == null) {
            throw new IllegalTipoServicoException("tipo do serviço não pode ser nulo");
        }
        
        this.tipo = t;
    }
    
    public TipoServico getTipo() {
        return this.tipo;
    }
    
    public void setDuracao(int duracao) throws IllegalDuracaoException {
        if (duracao < 1) {
            throw new IllegalDuracaoException();
        }
        
        this.duracao = duracao;
    }
    
    public int getDuracao() {
        return this.duracao;
    }
    
    public void setPreco(double preco) throws IllegalPrecoException {
        if (preco < 0) {
            throw new IllegalPrecoException("preço não pode ser inferior a 0");
        }
        
        this.preco = preco;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setDescricao(String desc) throws IllegalDescricaoException {
        if (desc == null) {
            throw new IllegalDescricaoException("descrição não pode ser nula");
        }
        
        desc = desc.trim();
        
        if (desc.isEmpty()) {
            throw new IllegalDescricaoException("descrição não pode ser vazia");
        } else if (desc.length() > 200) {
            throw new IllegalDescricaoException("descrição não pode conter mais de 200 caracteres");
        }
        
        this.descricao = desc;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
}
