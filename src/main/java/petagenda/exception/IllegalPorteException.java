package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalPorteException extends IllegalArgumentException {
    public IllegalPorteException() {
        super("porte inválido");
    }
    
    public IllegalPorteException(String message) {
        super(message);
    }
    
    public IllegalPorteException(String message, Throwable cause) {
        super(message, cause);
    }
}
