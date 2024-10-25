package petagenda.exception;

/**
 *
 * @author thiago
 */
public class IllegalClienteException extends IllegalArgumentException {
    public IllegalClienteException() {
        super("cliente inválido");
    }
    
    public IllegalClienteException(String message) {
        super(message);
    }
    
    public IllegalClienteException(String message, Throwable cause) {
        super(message, cause);
    }
}
