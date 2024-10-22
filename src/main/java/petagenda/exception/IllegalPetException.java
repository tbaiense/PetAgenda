package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalPetException extends ComparableException {
    public IllegalPetException() {
        super("pet inválido");
    }
    
    public IllegalPetException(String message) {
        super(message);
    }
    
    public IllegalPetException(String message, Throwable cause) {
        super(message, cause);
    }
}
