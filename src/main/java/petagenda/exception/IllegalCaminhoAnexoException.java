package petagenda.exception;

/**
 *
 * @author thiago
 */
public class IllegalCaminhoAnexoException extends IllegalArgumentException {
    public IllegalCaminhoAnexoException() {
        super("caminho de anexo inválido");
    }
    
    public IllegalCaminhoAnexoException(String message) {
        super(message);
    }
    
    public IllegalCaminhoAnexoException(String message, Throwable cause) {
        super(message, cause);
    }
}
