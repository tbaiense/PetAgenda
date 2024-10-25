package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalHoraAdministrarException extends IllegalArgumentException {
    public IllegalHoraAdministrarException() {
        super("a hora de administrar é inválida");
    }
    
    public IllegalHoraAdministrarException(String message) {
        super(message);
    }
    
    public IllegalHoraAdministrarException(String message, Throwable cause) {
        super(message, cause);
    }
}
