package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalRuaException extends IllegalArgumentException {
    public IllegalRuaException() {
        super("rua inválida");
    }
    
    public IllegalRuaException(String message) {
        super(message);
    }
    
    public IllegalRuaException(String message, Throwable cause) {
        super(message, cause);
    }
}
