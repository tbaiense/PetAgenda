package petagenda.exception;

import java.util.ArrayList;

/** Representa uma exceção que informa que um ou mais argumentos inválidos 
 * foram passados a um método ou contrutor. Possui uma lista de {@code Exception}, 
 * que armazena as causas desta exceção.
 *
 * @author Thiago M. Baiense
 */

public class IllegalArgumentsException extends Exception {
    private Throwable cause;
    private Throwable[] causes;
    
    public IllegalArgumentsException() {
        super("um ou mais argumentos são inválidos");
        this.causes = null;
    }
    
    public IllegalArgumentsException(String message) {
        super(message);
        this.causes = null;
    }
    
    public IllegalArgumentsException(Throwable cause) {
        super("um dos argumentos fornecidos é inválido");
        this.causes = new Throwable[] { cause };
    }
    
    public IllegalArgumentsException(Throwable... causes) {
        super("um dos argumentos fornecidos é inválido");
        this.initCauses(causes);
    }
    
    public IllegalArgumentsException(String message, Throwable cause) {
        super(message);
        this.initCauses(cause);
    }
    
    public IllegalArgumentsException(String message, Throwable... causes) {
        super(message);
        this.initCauses(causes);
    }
    
    public Throwable initCauses(Throwable... causes) {
        if (causes == null) {
            throw new NullPointerException();
        }
        
        ArrayList<Throwable> cList = new ArrayList<Throwable>();
        for(Throwable t : causes) {
            if (t != null) {
                cList.add(t);
            }
        }
        
        if (cList.isEmpty()) {
            return this;
        }
        
        Throwable[] tArray = new Throwable[cList.size()];
        cList.toArray(tArray);
        this.causes = tArray;
        return this;
    }
    
    public Throwable[] getCauses() {
        return this.causes;
    }
    
    @Override
    public Throwable getCause() {
        return this.causes[0];
    }
}
