package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalTelefoneException extends IllegalArgumentException {
    public IllegalTelefoneException() {
        super("telefone inválido");
    }
    
    public IllegalTelefoneException(String message) {
        super(message);
    }
    
    public IllegalTelefoneException(String message, Throwable cause) {
        super(message, cause);
    }
}
