package petagenda.exception;

/**
 *
 * @author thiago
 */
public class IllegalLocalCuidadoException extends IllegalArgumentException {
    public IllegalLocalCuidadoException() {
        super("local de cuidado inválido");
    }
    
    public IllegalLocalCuidadoException(String message) {
        super(message);
    }
    
    public IllegalLocalCuidadoException(String message, Throwable cause) {
        super(message, cause);
    }
}
