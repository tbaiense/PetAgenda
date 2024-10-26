package petagenda.agendamento;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import petagenda.Cliente;
import petagenda.Pet;
import petagenda.Usuario;
import petagenda.dados.Endereco;
import petagenda.dados.LocalAtuacao;
import petagenda.dados.Sexo;
import petagenda.exception.*;
import petagenda.servico.Servico;
import petagenda.servico.TipoServico;

/**
 *
 * @author thiago
 */
public final class Agendamento {
    private int id;
    private Servico servico;
    private LocalDateTime dataHoraMarcada;
    private Pet pet;
    private String enderecoPet;
    private Usuario funcionarioAgendado;
    private String observacao;
    private PacoteAgendamento pacote;
    private String buscarPetCom;
    private String devolverPetPara;
    private int qntPasseios;
    private String localCuidado;
    private ArrayList<Remedio> remedios;
    private ArrayList<LocalTime> horariosAlimentacao;
    
    // Exemplo de uso
    public static void main(String[] args) {
        try {
            TipoServico passeio = new TipoServico("Passeio");
            Servico dogWalking = new Servico("DogWalking", passeio, 60, 75.99);
            
            LocalDateTime hoje = LocalDateTime.of(2024, Month.OCTOBER, 26, 16, 30);
            
            Endereco itaparica = new Endereco("Rua Itaparica", "Numero 1", "Itaparica", "Vitória");
            Cliente maria = new Cliente("Maria", itaparica, "40028922", dogWalking);
            
            boolean eCastrado = false;
            Pet fred = new Pet("Frederico", maria, "Shi-tzu", Sexo.M, eCastrado);
            Endereco endFred = fred.getEndereco();
            
            LocalAtuacao itaparicaVix = LocalAtuacao.valueOf(itaparica);
            Usuario roberto = new Usuario("Roberto","40028922", dogWalking, itaparicaVix);
            
            Agendamento novoAgend = new Agendamento(dogWalking, hoje, fred, endFred.toString(), roberto);
            System.out.println(novoAgend.toString());
        } catch (IllegalArgumentsException exs) {
            for (Throwable c : exs.getCauses()) {
                System.out.println(c.getMessage());
            }
        }
    }
    
    public Agendamento(Servico servico, LocalDateTime dataHoraMarcada, Pet pet, String enderecoPet, Usuario funcionarioAgendado) {
        this(1, servico, dataHoraMarcada, pet, enderecoPet, funcionarioAgendado);
        this.id = -1;
    }
    
    public Agendamento(int id, Servico servico, LocalDateTime dataHoraMarcada, Pet pet, String enderecoPet, Usuario funcionarioAgendado) {
        IllegalArgumentsException exs = new IllegalArgumentsException();
        
        try {
            setId(id);
        } catch (IllegalIdException ex) {
            exs.addCause(ex);
        }
        
        try {
            setServico(servico);
        } catch (IllegalServicoException ex) {
            exs.addCause(ex);
        }
        
        try {
            setDataHoraMarcada(dataHoraMarcada);
        } catch (IllegalDataHoraMarcadaException ex) {
            exs.addCause(ex);
        }
        
        try {
            setPet(pet);
        } catch (IllegalPetException ex) {
            exs.addCause(ex);
        }
        
        try {
            setEnderecoPet(enderecoPet);
        } catch (IllegalEnderecoException ex) {
            exs.addCause(ex);
        }
        
        try {
            setFuncionarioAgendado(funcionarioAgendado);
        } catch (IllegalUsuarioException ex) {
            exs.addCause(ex);
        }
        
        if (exs.size() > 0) {
            throw exs;
        }
    }
    
    public void addHorarioAlimentacao(LocalTime horario) {
        if (horario == null) {
            throw new IllegalHorarioAlimentacaoException("horário de alimentação do pet não pode ser nulo");
        } else {
            this.horariosAlimentacao.add(horario);
        }
    }
    
    public void addRemedio(Remedio remedio) {
        if (remedio == null) {
            throw new IllegalHorarioAlimentacaoException("remédio não pode ser nulo");
        } else {
            this.remedios.add(remedio);
        }
    }
    
    public void clearHorariosAlimentacao() {
        this.horariosAlimentacao.clear();
    }
    
    public void clearRemedios() {
        this.remedios.clear();
    }
    
    public int getId() {
        return this.id;
    }
    
    public Servico getServico() {
        return this.servico;
    }
    
    public TipoServico getTipoServico() {
        return this.getServico().getTipo();
    }
    
    public LocalDateTime getDataHoraMarcada() {
        return this.dataHoraMarcada;
    }
    
    public Pet getPet() {
        return this.pet;
    }
    
    public String getEnderecoPet() {
        return this.enderecoPet;
    }
    
    public Usuario getFuncionarioAgendado() {
        return this.funcionarioAgendado;
    }
    
    public String getObservacao() {
        return this.observacao;
    }
    
    public PacoteAgendamento getPacote() {
        return this.pacote;
    }
    
    public String getBuscarPetCom() {
        return this.buscarPetCom;
    }
    
    public String getDevolverPetPara() {
        return this.devolverPetPara;
    }
    
    public int getQntPasseios() {
        return this.qntPasseios;
    }
    
    public String getLocalCuidado() {
        return this.localCuidado;
    }
    
    public int getHorariosAlimentacaoCount() {
        return this.horariosAlimentacao.size();
    }
    
    public LocalTime[] getHorariosAlimentacao() {
        return this.horariosAlimentacao.toArray(new LocalTime[getHorariosAlimentacaoCount()]);
    }
    
    public LocalTime getHorarioAlimentacao(int index) {
        return this.horariosAlimentacao.get(index);
    }
    
    public int getRemediosCount() {
        return this.remedios.size();
    }
    
    public Remedio[] getRemedios() {
        return this.remedios.toArray(new Remedio[getRemediosCount()]);
    }
    
    public Remedio getRemedio(int index) {
        return this.remedios.get(index);
    }
    
    public void removeHorarioAlimentacao(int index) {
        this.horariosAlimentacao.remove(index);
    }
    
    public void removeRemedio(int index) {
        this.remedios.remove(index);
    }
    
    public void setId(int id) {
        if (id < 0) {
            throw new IllegalIdException("id não pode ser inferior a zero");
        } else {
            this.id = id;
        }
    }
    
    public void setServico(Servico servico) {
        if (servico == null) {
            throw new IllegalServicoException("serviço agendado não pode ser nulo");
        } else {
            this.servico = servico;
        }
    }
    
    public void setDataHoraMarcada(LocalDateTime dthr) {
        if (dthr == null) {
            throw new IllegalDataHoraMarcadaException("data e hora marcada não pode ser nula");
        } else {
            this.dataHoraMarcada = dthr;
        }
    }
    
    public void setPet(Pet pet) {
        if (pet == null) {
            throw new IllegalPetException("pet não pode ser nulo");
        } else {
            this.pet = pet;
        }
    }
    
    public void setEnderecoPet(String enderecoPet) {
        if (enderecoPet == null) {
            this.enderecoPet = null;
        } else {
            enderecoPet = enderecoPet.trim();
            if (enderecoPet.isEmpty()) {
                this.enderecoPet = null;
            } else if (enderecoPet.length() > 255) {
                throw new IllegalEnderecoException("endereço não pode conter mais do que 255 caracteres");
            } else {
                this.enderecoPet = enderecoPet;
            }
        }
    }
    
    public void setEnderecoPet(Endereco enderecoPet) {
        if (enderecoPet == null) {
            throw new IllegalEnderecoException("endereço do Pet não pode ser nulo");
        } else {
            this.enderecoPet = enderecoPet.toString();
        }
    }
    
    public void setFuncionarioAgendado(Usuario funcionario) {
        if (funcionario == null) {
            throw new IllegalUsuarioException("funcionário não pode ser nulo");
        } else {
            this.funcionarioAgendado = funcionario;
        }
    }
    
    public void setObservacao(String obs) {
        if (obs != null) {
            obs = obs.trim();
            if (obs.length() > 255) {
                throw new IllegalObservacaoException("observação não pode conter mais do que 255 caracteres.");
            } else if (obs.isEmpty()) {
                obs = null;
            }
        }
        this.observacao = obs;
    }
    
    public void setPacote(PacoteAgendamento pac) {
        this.pacote = pac;
    }
    
    public void setBuscarPetCom(String buscarCom) {
        if (buscarCom != null) {
            buscarCom = buscarCom.trim();
            if (buscarCom.length() > 64) {
                throw new IllegalBuscarPetComException("informação de busca do Pet não pode conter mais do que 64 caracteres.");
            } else if (buscarCom.isEmpty()) {
                buscarCom = null;
            }
        }
        this.buscarPetCom = buscarCom;
    }
    
    public void setDevolverPetPara(String devolverPara) {
        if (devolverPara != null) {
            devolverPara = devolverPara.trim();
            if (devolverPara.length() > 64) {
                throw new IllegalDevolverPetParaException("informação de devolução do Pet não pode conter mais do que 64 caracteres.");
            } else if (devolverPara.isEmpty()) {
                devolverPara = null;
            }
        }
        this.devolverPetPara = devolverPara;
    }
    
    public void setQntPasseios(int passeios) {
        if (passeios < 0) {
            throw new IllegalQuantidadePasseiosException("quantidade de passeios não pode ser inferior a zero");
        } else {
            this.qntPasseios = passeios;
        }
    }
    
    public void setLocalCuidado(String local) {
        if (local != null) {
            local = local.trim();
            if (local.length() > 255) {
                throw new IllegalLocalCuidadoException("local do cuidado do Pet não pode conter mais do que 255 caracteres.");
            } else if (local.isEmpty()) {
                local = null;
            }
        }
        this.localCuidado = local;
    }
    
    public void setHorariosAlimentacao(LocalTime... horarios) {
        this.clearHorariosAlimentacao();
        if (horarios != null) {
            for (LocalTime h : horarios) {
                if (h != null) {
                    this.addHorarioAlimentacao(h);
                }
            }
        }
    }
    
    public void setRemedios(Remedio... remedios) {
        this.clearRemedios();
        if (remedios != null) {
            for (Remedio r : remedios) {
                if (r != null) {
                    this.addRemedio(r);
                }
            }
        }
    }
    
    @Override
    public String toString() {
        return String.format("--- AGENDAMENTO ---\n  TIPO DO SERVICO: %s | SERVIÇO: %s\n  PET: %s | END. PET: %s\n  DT. HR. MARCADA.: %s | FUNCIONARIO AGEND.: %s", 
                getServico().getTipo().getNome(), getServico().getNome(), getPet().getNome(), getEnderecoPet(), getDataHoraMarcada().toString(), 
                getFuncionarioAgendado().getNome());
    }
}
