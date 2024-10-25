package petagenda.agendamento;

import java.time.LocalTime;
import petagenda.exception.IllegalAgendamentoException;
import petagenda.exception.IllegalHoraAdministrarException;
import petagenda.exception.IllegalInstrucoesException;
import petagenda.exception.IllegalNomeException;

/**
 *
 * @author thiago
 */
public final class Remedio {
    private Agendamento agendamento;
    private String nome;
    private LocalTime horaAdministrar;
    private String instrucoes;
    
    public Remedio (Agendamento agendamento, String nome, LocalTime horaAdministrar, String instrucoes) {
    
    
    }
    
    public void setAgendamento(Agendamento agendamento) {
        if (agendamento == null) {
            throw new IllegalAgendamentoException("agendamento não pode ser nulo");
        } else {
            this.agendamento = agendamento;
        }
    }
    
    public Agendamento getAgendamento() {
        return this.agendamento;
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
    
    public void setHoraAdministrar(LocalTime hr) {
        if (hr == null) {
            throw new IllegalHoraAdministrarException("hora de adminstrar o remédio não pode ser nula");
        } else {
            this.horaAdministrar = hr;
        }
    }
    
    public LocalTime getHoraAdministrar() {
        return this.horaAdministrar;
    }
    
    public void setInstrucoes(String instrucoes) {
        if (instrucoes == null) {
            this.instrucoes = null;
        } else {
            instrucoes = instrucoes.trim();
            if (instrucoes.isEmpty()) {
                this.instrucoes = null;
            } else if (instrucoes.length() > 120) {
                throw new IllegalInstrucoesException("instruções não podem conter mais do que 120 caracteres");
            } else {
                this.instrucoes = instrucoes;
            }
        }
    }
    
    public String getInstrucoes() {
        return this.instrucoes;
    }
}
