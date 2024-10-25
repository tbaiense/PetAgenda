package petagenda.exception;

import java.util.ArrayList;

/** Representa uma exceção que informa que um ou mais argumentos inválidos 
 * foram passados a um método ou contrutor. Possui uma lista de {@code Exception}, 
 * que armazena as causas desta exceção.
 *
 * @author Thiago M. Baiense
 */

public class IllegalArgumentsException extends IllegalArgumentException {
    private Throwable cause;
    private ArrayList<Throwable> causeList = new ArrayList<Throwable>();
    
    public IllegalArgumentsException() {
        super("um ou mais argumentos são inválidos");
    }
    
    public IllegalArgumentsException(String message) {
        super(message);
    }
    
    public IllegalArgumentsException(Throwable cause) {
        super("um dos argumentos fornecidos é inválido");
        this.causeList.add(cause);
    }
    
    public IllegalArgumentsException(Throwable... causes) {
        super("um ou mais dos argumentos fornecidos é inválido");
        this.initCauseList(causes);
    }
    
    public IllegalArgumentsException(String message, Throwable cause) {
        super(message);
        this.initCauseList(cause);
    }
    
    public IllegalArgumentsException(String message, Throwable... causes) {
        super(message);
        this.initCauseList(causes);
    }
    
    public Throwable initCauseList(Throwable... causes) {
        if (causes == null) {
            throw new NullPointerException();
        }
        
        for(Throwable t : causes) {
            if (t != null) {
                this.causeList.add(t);
            }
        }
        return this;
    }
    
    public Throwable addCause(IllegalArgumentException cause) {
        this.causeList.add(cause);
        return this;
    }
    
    public int size() { // Retorna a quantidade de causes
        return this.causeList.size();
    }
    
    public Throwable[] getCauses() {
        Throwable[] cArray = new Throwable[this.size()];
        return causeList.toArray(cArray);
    }
    
    @Override
    public Throwable getCause() {
        return this.causeList.get(0);
    }
    
    public Throwable getCause(int index) {
        return this.causeList.get(index);
    }
}
