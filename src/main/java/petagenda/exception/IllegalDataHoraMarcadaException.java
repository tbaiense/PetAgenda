package petagenda.exception;

import java.time.DateTimeException;

/**
 *
 * @author thiago
 */
public class IllegalDataHoraMarcadaException extends IllegalArgumentException {
    public IllegalDataHoraMarcadaException() {
        super("data e hora de agendamento inválida");
    }
    
    public IllegalDataHoraMarcadaException(String message) {
        super(message);
    }
    
    public IllegalDataHoraMarcadaException(String message, Throwable cause) {
        super(message, cause);
    }
}
