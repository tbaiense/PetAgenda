package petagenda.agendamento;

import java.util.ArrayList;
import petagenda.exception.IllegalAgendamentoException;
import petagenda.exception.IllegalArgumentsException;
import petagenda.exception.IllegalIdException;

/**
 *
 * @author thiago
 */
public final class PacoteAgendamento {
    private int id;
    private ArrayList<Agendamento> agendamentos;
    
    public PacoteAgendamento() {
        this.id = -1;
        this.agendamentos = new ArrayList<Agendamento>();
    }
    
    public PacoteAgendamento(Agendamento... agendamentos) {
        this(1, agendamentos);
        this.id = -1;
    }
    
    public PacoteAgendamento(int id, Agendamento... agendamentos) {
        IllegalArgumentsException exs = new IllegalArgumentsException();
        
        try {
            setId(id);
        } catch (IllegalIdException ex) {
            exs.addCause(ex);
        }
        
        try {
            setAgendamentos(agendamentos);
        } catch (IllegalAgendamentoException ex) {
            exs.addCause(ex);
        }
        
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
    
    public int size() {
        return this.agendamentos.size();
    }
    
    public Agendamento getAgendamento(int index) {
        return this.agendamentos.get(index);
    }
    
    public void removeAgendamento(int index) {
        this.agendamentos.remove(index);
    }
    
    public Agendamento[] getAgendamentos() {
        if (agendamentos.size() > 0) {
            Agendamento[] agendamentoArray = new Agendamento[agendamentos.size()];
            agendamentos.toArray(agendamentoArray);
            return agendamentoArray;
        } else {
            return null;
        }
    }
    
    public void addAgendamento(Agendamento agendamento) {
        if (agendamento == null) {
            throw new IllegalAgendamentoException("agendamento não pode ser nulo");
        } else {
            this.agendamentos.add(agendamento);
        }
    }
    
    public void clearAgendamentos() {
        this.agendamentos.clear();
    }
    
    public void setAgendamentos(Agendamento... agendamentos) {
        this.clearAgendamentos();
        if (agendamentos == null) {
            return;
        }
        
        for (Agendamento a : agendamentos) {
            if (a != null) {
                this.addAgendamento(a);
            }
        }
    }
}
