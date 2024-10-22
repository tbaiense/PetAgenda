package petagenda.exception;

/**
 *
 * @author thiago
 */
public class IllegalAgendamentoException extends ComparableException  {
    public IllegalAgendamentoException() {
        super("agendamento inválido");
        
    }
    
    public IllegalAgendamentoException(String message) {
        super(message);
    }
    
    public IllegalAgendamentoException(String message, Throwable cause) {
        super(message, cause);
    }
}
