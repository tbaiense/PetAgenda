package petagenda.historico;

import java.time.LocalDateTime;
//import java.time.Month;
import java.util.ArrayList;
//import petagenda.Cliente;
//import petagenda.Pet;
//import petagenda.Usuario;
import petagenda.agendamento.Agendamento;
//import petagenda.agendamento.Remedio;
//import petagenda.dados.Endereco;
//import petagenda.dados.LocalAtuacao;
//import petagenda.dados.Sexo;
import petagenda.exception.*;
//import petagenda.servico.Servico;
//import petagenda.servico.TipoServico;

/**
 *
 * @author thiago
 */
public final class HistoricoServico {
    private int id;
    private Agendamento agendamento;
    private String descricao;
    private LocalDateTime dataHoraFinalizado;
    private int duracao;
    private String observacao;
    private String comportamentoPet;
    private Incidente incidente;
    private ArrayList<Anexo> anexos = new ArrayList<Anexo>();
    
    // Exemplo de uso
//    public static void main(String[] args) {
//        try {
//            TipoServico passeio = new TipoServico("Passeio");
//            Servico dogWalking = new Servico("DogWalking", passeio, 60, 75.99);
//            
//            LocalDateTime hoje = LocalDateTime.of(2024, Month.OCTOBER, 26, 16, 30);
//            
//            Endereco itaparica = new Endereco("Rua Itaparica", "Numero 1", "Itaparica", "Vitória");
//            Cliente maria = new Cliente("Maria", itaparica, "40028922", dogWalking);
//            
//            boolean eCastrado = false;
//            Pet fred = new Pet("Frederico", maria, "Shi-tzu", Sexo.M, eCastrado);
//            Endereco endFred = fred.getEndereco();
//            
//            LocalAtuacao itaparicaVix = LocalAtuacao.valueOf(itaparica);
//            Usuario roberto = new Usuario("Roberto","40028922", dogWalking, itaparicaVix);
//            
//            Agendamento novoAgend = new Agendamento(dogWalking, hoje, fred, endFred.toString(), roberto);
//            
//            LocalDateTime dtHrFinalizado = hoje.plusMinutes(dogWalking.getDuracao());
//            HistoricoServico servicoFred = new HistoricoServico(novoAgend, dtHrFinalizado);
//            System.out.println(servicoFred.toString());
//        } catch (IllegalArgumentsException exs) {
//            for (Throwable c : exs.getCauses()) {
//                System.out.println(c.getMessage());
//            }
//        }
//    }
    
    public HistoricoServico(Agendamento agendamento, LocalDateTime dataHoraFinalizado) {
        this(agendamento, dataHoraFinalizado, 1);
        this.setDuracao(agendamento.getServico().getDuracao());
    }
    
    public HistoricoServico(int id, Agendamento agendamento, LocalDateTime dataHoraFinalizado) {
        this(id ,agendamento, dataHoraFinalizado, 1);
        this.setDuracao(agendamento.getServico().getDuracao());
    }
    
    public HistoricoServico(Agendamento agendamento, LocalDateTime dataHoraFinalizado, int duracao) {
        this(1, agendamento, dataHoraFinalizado, duracao);
        this.id = -1;
    }
    
    public HistoricoServico(int id, Agendamento agendamento, LocalDateTime dataHoraFinalizado, int duracao) {
        IllegalArgumentsException exs = new IllegalArgumentsException();
        
        try {
            setId(id);
        } catch (IllegalIdException ex) {
            exs.addCause(ex);
        }
        
        try {
            setAgendamento(agendamento);
        } catch (IllegalAgendamentoException ex) {
            exs.addCause(ex);
        }
        
        try {
            setDataHoraFinalizado(dataHoraFinalizado);
        } catch (IllegalDataHoraFinalizadoException ex) {
            exs.addCause(ex);
        }
        
        try {
            setDuracao(duracao);
        } catch (IllegalDuracaoException ex) {
            exs.addCause(ex);
        }
        
        if (exs.size() > 0) {
            throw exs;
        }
    }
    
    public void addAnexo(Anexo anexo) {
        this.anexos.add(anexo);
    }
    
    public void clearAnexos() {
        this.anexos.clear();
    }
    
    public int getId() {
        return this.id;
    }
    
    public Agendamento getAgendamento() {
        return this.agendamento;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public LocalDateTime getDataHoraFinalizado() {
        return this.dataHoraFinalizado;
    }
    
    public int getDuracao() {
        return this.duracao;
    }
    
    public String getObservacao() {
        return this.observacao;
    }
    
    public String getComportamentoPet() {
        return this.comportamentoPet;
    }
    
    public Incidente getIncidente() {
        return this.incidente;
    }
    
    public Anexo getAnexo(int index) {
        return this.anexos.get(index);
    }
    
    
    public Anexo[] getAnexos() {
        if (getAnexosCount() > 0) {
            return this.anexos.toArray(new Anexo[getAnexosCount()]);
        } else {
            return null;
        }
    }
    
    public int getAnexosCount() {
        return this.anexos.size();
    }
    
    public void setId(int id) {
        if (id < 0) {
            throw new IllegalIdException("id não pode ser inferior a zero");
        } else {
            this.id = id;
        }
    }
    
    public void removeAnexo(int index) {
        this.anexos.remove(index);
    }
    
    public void setAgendamento(Agendamento agendamento) {
        if (agendamento == null) {
            throw new IllegalAgendamentoException("agendamento não pode ser nulo");
        } else {
            this.agendamento = agendamento;  
        }

    }
    
    public void setAnexos(Anexo... anexos) {
        clearAnexos();
        if (anexos != null) {
            for (Anexo a : anexos) {
                if (a != null) {
                    addAnexo(a);
                }
            }
        }
    }
    
    public void setDescricao(String descricao) {
        if (descricao != null) {
            descricao = descricao.trim();
            if (descricao.isEmpty()) {
                descricao = null;
            } else if (descricao.length() > 500) {
                throw new IllegalDescricaoException("descrição não pode conter mais do que 500 caracteres;");
            }
        }
        this.descricao = descricao;
    }
    
    public void setDataHoraFinalizado(LocalDateTime dthr) {
        if (dthr == null ) {
            throw new IllegalDataHoraFinalizadoException("data hora de finalização não pode ser nula");
        } else {
            this.dataHoraFinalizado = dthr;
        }
    }
    
    public void setDuracao(int duracao) {
        if (duracao < 1) {
            throw new IllegalDuracaoException("duração do serviço não pode ser inferior a 1 minuto");
        } else {
            this.duracao = duracao;
        }
    }
    
    public void setObservacao(String observacao) {
        if (observacao != null) {
            observacao = observacao.trim();
            if (observacao.isEmpty()) {
                observacao = null;
            } else if (observacao.length() > 255) {
                throw new IllegalObservacaoException("observação não pode conter mais que 255 caracteres");
            }
        }
        this.observacao = observacao;
    }
    
    public void setComportamentoPet(String comportamento) {
        if (comportamento != null) {
            comportamento = comportamento.trim();
            if (comportamento.isEmpty()) {
                comportamento = null;
            } else if (comportamento.length() > 120) {
                throw new IllegalComportamentoPetException("comportamento do pet não pode conter mais que 120 caracteres");
            }
        }
        this.comportamentoPet = comportamento;
    }
    
    public void setIncidente(Incidente incidente) {
        this.incidente = incidente;
    }
    
    @Override
    public String toString() {
        return String.format("---- HISTORICO SERVICO ----\nSERVICO: %s | DATA HORA FINALIZADO: %s\nDURAÇÃO: %s min. | PET: %s", 
                getAgendamento().getServico().getNome(), getDataHoraFinalizado().toString(), getDuracao(), getAgendamento().getPet().getNome());
    }
}
