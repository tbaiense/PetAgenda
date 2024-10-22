package petagenda.exception;

/**
 *
 * @author t.baiense
 */
public class IllegalHorarioAlimentacaoException extends ComparableException {
    public IllegalHorarioAlimentacaoException() {
        super("horário de alimentacao do pet inválido");
    }
    
    public IllegalHorarioAlimentacaoException(String message) {
        super(message);
    }
    
    public IllegalHorarioAlimentacaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
