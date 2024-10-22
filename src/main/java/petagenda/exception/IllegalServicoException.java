package petagenda.exception;

/** Representa uma exceção que ocorre quando um {@link petagenda.servico.Servico Serviço} inválido é fornecido
 * como argumento a um método ou construtor.
 *
 * @author thiago
 */
public class IllegalServicoException extends ComparableException {
    
//    public int order_index = 4;
    
    public IllegalServicoException() {
        super("serviço inválido");
        super.order_index = 4;
    }
    
    public IllegalServicoException(String message) {
        super(message);
        super.order_index = 4;
    }
    
    public IllegalServicoException(String message, Throwable cause) {
        super(message, cause);
        super.order_index = 4;
    }
}
