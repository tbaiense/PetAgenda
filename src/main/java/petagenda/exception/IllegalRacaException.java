package petagenda.exception;

/**
 *
 * @author thiago
 */
public class IllegalRacaException extends ComparableException {
    public IllegalRacaException() {
        super("raça inválida");
    }
    
    public IllegalRacaException(String message) {
        super(message);
    }
    
    public IllegalRacaException(String message, Throwable cause) {
        super(message, cause);
    }
}
