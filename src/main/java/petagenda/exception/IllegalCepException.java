package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalCepException extends Exception {
    public IllegalCepException() {
        super("CEP inválido");
    }
    
    public IllegalCepException(String message) {
        super(message);
    }
    
    public IllegalCepException(String message, Throwable cause) {
        super(message, cause);
    }
}
