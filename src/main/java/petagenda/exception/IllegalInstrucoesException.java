package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalInstrucoesException extends IllegalArgumentException {
    public IllegalInstrucoesException() {
        super("as intruções são inválidas");
    }
    
    public IllegalInstrucoesException(String message) {
        super(message);
    }
    
    public IllegalInstrucoesException(String message, Throwable cause) {
        super(message, cause);
    }
}
