package petagenda.exception;

import java.time.DateTimeException;

/**
 *
 * @author thiago
 */
public class IllegalDataHoraOcorreuException extends IllegalArgumentException {
    public IllegalDataHoraOcorreuException() {
        super("data e hora de ocorrência inválida");
    }
    
    public IllegalDataHoraOcorreuException(String message) {
        super(message);
    }
    
    public IllegalDataHoraOcorreuException(String message, Throwable cause) {
        super(message, cause);
    }
}
