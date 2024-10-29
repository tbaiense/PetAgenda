package petagenda.exception;

import java.time.DateTimeException;

/**
 *
 * @author thiago
 */
public class IllegalUsuarioException extends DateTimeException {
    public IllegalUsuarioException() {
        super("usuario inválido");
    }
    
    public IllegalUsuarioException(String message) {
        super(message);
    }
    
    public IllegalUsuarioException(String message, Throwable cause) {
        super(message, cause);
    }
}
