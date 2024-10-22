package petagenda.exception;

/** Representa uma exceção que ocorre quando uma duração (em minutos) inválida 
 * é fornecida como argumento a um método ou construtor.
 *
 * @author thiago
 */
public class IllegalDuracaoException extends ComparableException {
    public IllegalDuracaoException() {
        super("duração inválida");
    }
    
    public IllegalDuracaoException(String message) {
        super(message);
    }
    
    public IllegalDuracaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
