package petagenda.exception;

/**
 *
 * @author thiago
 */
public class IllegalEnderecoException extends IllegalArgumentException {
    public IllegalEnderecoException() {
        super("endereço inválido");
    }
    
    public IllegalEnderecoException(String message) {
        super(message);
    }
    
    public IllegalEnderecoException(String message, Throwable cause) {
        super(message, cause);
    }
}
