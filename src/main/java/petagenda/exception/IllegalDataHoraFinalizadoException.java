package petagenda.exception;

import java.time.DateTimeException;

/**
 *
 * @author thiago
 */
public class IllegalDataHoraFinalizadoException extends IllegalArgumentException {
    public IllegalDataHoraFinalizadoException() {
        super("data e hora de finalização inválida");
    }
    
    public IllegalDataHoraFinalizadoException(String message) {
        super(message);
    }
    
    public IllegalDataHoraFinalizadoException(String message, Throwable cause) {
        super(message, cause);
    }
}
