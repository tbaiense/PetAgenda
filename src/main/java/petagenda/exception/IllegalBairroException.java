package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalBairroException extends Exception {
    public IllegalBairroException() {
        super("bairro inválido");
    }
    
    public IllegalBairroException(String message) {
        super(message);
    }
    
    public IllegalBairroException(String message, Throwable cause) {
        super(message, cause);
    }
}
