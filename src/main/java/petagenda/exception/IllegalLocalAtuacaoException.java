package petagenda.exception;

/**
 *
 * @author thiago
 */
public class IllegalLocalAtuacaoException extends IllegalArgumentException {
    public IllegalLocalAtuacaoException() {
        super("local de atuação inválido");
    }
    
    public IllegalLocalAtuacaoException(String message) {
        super(message);
    }
    
    public IllegalLocalAtuacaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
