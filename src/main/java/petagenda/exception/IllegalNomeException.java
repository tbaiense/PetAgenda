package petagenda.exception;

/** Representa uma exceção que ocorre quando um {@code nome} inválido é fornecido
 * como argumento a um método ou construtor.
 *
 * @author thiago
 */
public class IllegalNomeException extends IllegalArgumentException {
    public IllegalNomeException() {
        super("nome inválido");
    }
    
    public IllegalNomeException(String message) {
        super(message);
    }
    
    public IllegalNomeException(String message, Throwable cause) {
        super(message, cause);
    }
}
