package petagenda.exception;

/** Representa uma exceção que ocorre quando um {@link petagenda.servico.Servico Serviço} inválido é fornecido
 * como argumento a um método ou construtor.
 *
 * @author thiago
 */
public class IllegalServicoException extends Exception {
    public IllegalServicoException() {
        super("serviço inválido");
    }
    
    public IllegalServicoException(String message) {
        super(message);
    }
    
    public IllegalServicoException(String message, Throwable cause) {
        super(message, cause);
    }
}
