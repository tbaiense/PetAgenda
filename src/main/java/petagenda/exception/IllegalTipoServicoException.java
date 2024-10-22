package petagenda.exception;

/** Representa uma exceção que ocorre quando um {@code petagenda.servico.TipoServico TipoServico } inválido é 
 * fornecido como argumento a um método ou construtor.
 *
 * @author thiago
 */
public class IllegalTipoServicoException extends Exception {
    public IllegalTipoServicoException() {
        super("tipo de serviço inválido");
    }
    
    public IllegalTipoServicoException(String message) {
        super(message);
    }
    
    public IllegalTipoServicoException(String message, Throwable cause) {
        super(message, cause);
    }
}
