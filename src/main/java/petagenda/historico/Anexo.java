package petagenda.historico;

import petagenda.agendamento.Agendamento;
import petagenda.exception.IllegalAgendamentoException;
import petagenda.exception.IllegalAnexoException;
import petagenda.exception.IllegalArgumentsException;
import petagenda.exception.IllegalCaminhoAnexoException;
import petagenda.exception.IllegalHistoricoServicoException;
import petagenda.exception.IllegalNomeException;

/**
 *
 * @author thiago
 */
public final class Anexo {
    private HistoricoServico servico;
    private String nome;
    private String caminhoAnexo; // Caminho do caminhoAnexo
    
    public Anexo(HistoricoServico servico, String nome, String caminhoAnexo) {
        IllegalArgumentsException exs = new IllegalArgumentsException();
        
        try {
            setHistoricoServico(servico);
        } catch (IllegalHistoricoServicoException ex) {
            exs.addCause(ex);
        }
        
        try {
            setNome(nome);
        } catch (IllegalNomeException ex) {
            exs.addCause(ex);
        }
        
        try {
            setCaminhoAnexo(caminhoAnexo);
        } catch (IllegalCaminhoAnexoException ex) {
            exs.addCause(ex);
        }
        
        if (exs.size() > 0) {
            throw exs;
        }
    }
    
    public void setHistoricoServico(HistoricoServico servico) {
        if (servico == null) {
            throw new IllegalHistoricoServicoException("serviço não pode ser nulo");
        } else {
            this.servico = servico;
        }
    }
    
    public HistoricoServico getHistoricoServico() {
        return this.servico;
    }
    
    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalNomeException("nome não pode ser nulo");
        } else {
            nome = nome.trim();
            if (nome.isEmpty()) {
                throw new IllegalNomeException("nome não pode ser vazio");
            } else if (nome.length() > 64) {
                throw new IllegalNomeException("nome não pode conter mais do que 64 caracteres");
            } else {
                this.nome = nome;
            }
        }
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setCaminhoAnexo(String caminho) {
        if (caminho == null) {
            throw new IllegalCaminhoAnexoException("caminho do anexo não pode ser nulo");
        } else {
            caminho = caminho.trim();
            if (caminho.isEmpty()) {
                throw new IllegalCaminhoAnexoException("caminho do anexo não pode ser vazio");
            } else if (caminho.length() > 255) {
                throw new IllegalCaminhoAnexoException("caminho do anexo não pode conter mais do que 255 caracteres");
            } else {
                this.caminhoAnexo = caminho;
            }
        }
    }
    
    public String getCaminhoAnexo() {
        return this.caminhoAnexo;
    }
}
