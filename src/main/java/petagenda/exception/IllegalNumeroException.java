package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalNumeroException extends IllegalArgumentException {
    public IllegalNumeroException() {
        super("número inválido");
    }
    
    public IllegalNumeroException(String message) {
        super(message);
    }
    
    public IllegalNumeroException(String message, Throwable cause) {
        super(message, cause);
    }
}