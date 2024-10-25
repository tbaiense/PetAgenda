package petagenda.agendamento;

import java.time.LocalDateTime;
import petagenda.Pet;
import petagenda.Usuario;
import petagenda.dados.Endereco;
import petagenda.exception.IllegalEnderecoException;
import petagenda.servico.Servico;

/**
 *
 * @author thiago
 */
public class Agendamento {
    private int id;
    private Servico servico;
    private LocalDateTime dataHoraMarcada;
    private Pet pet;
    private String enderecoPet;
    private Usuario funcionarioAgendado;
    private String observacao;
    private PacoteAgendamento pacote;
    private int qntPasseios;
    private String localCuidado;
    
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
    
    public String getEnderecoPet() {
        return this.enderecoPet;
    }
}
