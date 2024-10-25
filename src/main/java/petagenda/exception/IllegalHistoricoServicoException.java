package petagenda.exception;

/** Representa uma exceção que ocorre quando um {@code petagenda.servico.TipoServico TipoServico } inválido é 
 * fornecido como argumento a um método ou construtor.
 *
 * @author thiago
 */
public class IllegalHistoricoServicoException extends IllegalArgumentException {
    public IllegalHistoricoServicoException() {
        super("histórico de serviço inválido");
    }
    
    public IllegalHistoricoServicoException(String message) {
        super(message);
    }
    
    public IllegalHistoricoServicoException(String message, Throwable cause) {
        super(message, cause);
    }
}
