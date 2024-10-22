package petagenda.exception;

/** Representa uma exceção que ocorre quando uma duração (em minutos) inválida 
 * é fornecida como argumento a um método ou construtor.
 *
 * @author thiago
 */
public class IllegalDevolverPetParaException extends ComparableException {
    public IllegalDevolverPetParaException() {
        super("informação de devolução do pet inválida");
    }
    
    public IllegalDevolverPetParaException(String message) {
        super(message);
    }
    
    public IllegalDevolverPetParaException(String message, Throwable cause) {
        super(message, cause);
    }
}
