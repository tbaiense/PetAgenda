package petagenda.exception;

/**
 *
 * @author thiago
 */
public class IllegalCaminhoCartaoVacinacaoException extends ComparableException {
    public IllegalCaminhoCartaoVacinacaoException() {
        super("caminho de cartão de vacinação inválido");
    }
    
    public IllegalCaminhoCartaoVacinacaoException(String message) {
        super(message);
    }
    
    public IllegalCaminhoCartaoVacinacaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
