package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalCidadeException extends IllegalArgumentException {
    public IllegalCidadeException() {
        super("cidade inválida");
    }
    
    public IllegalCidadeException(String message) {
        super(message);
    }
    
    public IllegalCidadeException(String message, Throwable cause) {
        super(message, cause);
    }
}
