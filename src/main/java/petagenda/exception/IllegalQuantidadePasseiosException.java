package petagenda.exception;

/** 
 *
 * @author thiago
 */
public class IllegalQuantidadePasseiosException extends ComparableException {
    public IllegalQuantidadePasseiosException() {
        super("quantidade de passeios inválida");
    }
    
    public IllegalQuantidadePasseiosException(String message) {
        super(message);
    }
    
    public IllegalQuantidadePasseiosException(String message, Throwable cause) {
        super(message, cause);
    }
}
