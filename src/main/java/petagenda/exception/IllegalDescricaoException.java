package petagenda.exception;

/** Representa uma exceção que informa que uma descrição inválida foi fornecida 
 * como argumento a um método ou construtor.
 *
 * @author thiago
 */
public class IllegalDescricaoException extends Exception {
    public IllegalDescricaoException() {
        super("descrição inválida");
    }
    
    public IllegalDescricaoException(String message) {
        super(message);
    }
    
    public IllegalDescricaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
