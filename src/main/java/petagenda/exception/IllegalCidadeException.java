package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalCidadeException extends Exception {
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
