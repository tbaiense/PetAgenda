package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalPermissaoException extends IllegalArgumentException {
    public IllegalPermissaoException() {
        super("permissao inválida");
    }
    
    public IllegalPermissaoException(String message) {
        super(message);
    }
    
    public IllegalPermissaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
