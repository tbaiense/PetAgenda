package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalCpfException extends IllegalArgumentException {
    public IllegalCpfException() {
        super("CPF inválido");
    }
    
    public IllegalCpfException(String message) {
        super(message);
    }
    
    public IllegalCpfException(String message, Throwable cause) {
        super(message, cause);
    }
}
