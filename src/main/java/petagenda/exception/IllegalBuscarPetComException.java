package petagenda.exception;

/** Representa uma exceção que informa que uma descrição inválida foi fornecida 
 * como argumento a um método ou construtor.
 *
 * @author thiago
 */
public class IllegalBuscarPetComException extends IllegalArgumentException {
    public IllegalBuscarPetComException() {
        super("informação de busca do pet inválida");
    }
    
    public IllegalBuscarPetComException(String message) {
        super(message);
    }
    
    public IllegalBuscarPetComException(String message, Throwable cause) {
        super(message, cause);
    }
}
