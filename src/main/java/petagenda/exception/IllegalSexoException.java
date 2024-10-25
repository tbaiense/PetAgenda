package petagenda.exception;

/**
 *
 * @author thiago
 */
public class IllegalSexoException extends IllegalArgumentException {
    public IllegalSexoException() {
        super("sexo inválido");
    }
    
    public IllegalSexoException(String message) {
        super(message);
    }
    
    public IllegalSexoException(String message, Throwable cause) {
        super(message, cause);
    }
}
