package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalPetException extends IllegalArgumentException {
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
