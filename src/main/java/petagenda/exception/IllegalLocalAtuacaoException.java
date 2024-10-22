package petagenda.exception;

/**
 *
 * @author thiago
 */
public class IllegalLocalAtuacaoException extends ComparableException {
    
    public IllegalLocalAtuacaoException() {
        super("local de atuação inválido");
        super.order_index = 10;
    }
    
    public IllegalLocalAtuacaoException(String message) {
        super(message);
        super.order_index = 10;
    }
    
    public IllegalLocalAtuacaoException(String message, Throwable cause) {
        super(message, cause);
        super.order_index = 10;
    }
}
