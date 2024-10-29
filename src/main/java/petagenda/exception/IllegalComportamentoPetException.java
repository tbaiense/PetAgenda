package petagenda.exception;

/** 
 *
 * @author thiago
 */
public class IllegalComportamentoPetException extends IllegalArgumentException {
    public IllegalComportamentoPetException() {
        super("comportamento de pet inválido");
    }
    
    public IllegalComportamentoPetException(String message) {
        super(message);
    }
    
    public IllegalComportamentoPetException(String message, Throwable cause) {
        super(message, cause);
    }
}
