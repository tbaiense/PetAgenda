package petagenda.historico;

import java.time.LocalDateTime;
import petagenda.Pet;
import petagenda.exception.IllegalDataHoraOcorreuException;
import petagenda.exception.IllegalDescricaoException;
import petagenda.exception.IllegalIdException;
import petagenda.exception.IllegalPetException;
import petagenda.exception.IllegalServicoException;
import petagenda.servico.Servico;

/**
 *
 * @author thiago
 */
public final class Incidente {
    private int id;
    private LocalDateTime dataHoraOcorreu;
    private boolean emergencia;
    private Servico servicoContratado;
    private Pet pet;
    private String descricao;
    
    public int getId() {
        return this.id;
    }
    
    public LocalDateTime getDataHoraOcorreu() {
        return this.dataHoraOcorreu;
    }
    
    public boolean isEmergencia() {
        return this.emergencia;
    }
    
    public Servico getServicoContratado() {
        return this.servicoContratado;
    }
    
    public Pet getPet() {
        return this.pet;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setId(int id) {
        if (id < 0) {
            throw new IllegalIdException("id não pode ser menor que 0");
        } else {
            this.id = id;
        }
    }
    
    public void setDataHoraOcorreu(LocalDateTime dataHoraOcorreu) {
        if (dataHoraOcorreu == null) {
            throw new IllegalDataHoraOcorreuException("data e hora de ocorrência não pode ser nula");
        } else {
            this.dataHoraOcorreu = dataHoraOcorreu;
        }
    }
    
    public void setEmergencia(boolean emergencia) {
        this.emergencia = emergencia;
    }
    
    public void setServicoContratado(Servico servico) {
        if (servico == null) {
            throw new IllegalServicoException("serviço contratado não pode ser nulo");
        } else {
            this.servicoContratado = servico;
        }
    }
    
    public void setPet(Pet pet) {
        if (pet == null) {
            throw new IllegalPetException("pet não pode ser nulo");
        } else {
            this.pet = pet;
        }
    }
    
    public void setDescricao(String descricao) {
        if (descricao == null) {
            throw new IllegalDescricaoException("descricao não pode ser nula");
        } else {
            descricao = descricao.trim();
            if (descricao.isEmpty()) {
                throw new IllegalDescricaoException("descrição não pode ser vazia");
            } else if (descricao.length() > 500) {
                throw new IllegalDescricaoException("descrição não pode conter mais do que 500 caracteres");
            } else {
                this.descricao = descricao;
            }
        }
    }
}
