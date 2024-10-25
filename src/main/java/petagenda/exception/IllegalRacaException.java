package petagenda.exception;

/**
 *
 * @author thiago
 */
public class IllegalRacaException extends IllegalArgumentException {
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
