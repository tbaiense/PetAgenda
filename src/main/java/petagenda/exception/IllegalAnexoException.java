package petagenda.exception;

/**
 *
 * @author thiago
 */
public class IllegalAnexoException extends IllegalArgumentException {
    public IllegalAnexoException() {
        super("anexo inválido");
    }
    
    public IllegalAnexoException(String message) {
        super(message);
    }
    
    public IllegalAnexoException(String message, Throwable cause) {
        super(message, cause);
    }
}
