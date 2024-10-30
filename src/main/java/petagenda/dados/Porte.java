package petagenda.dados;

/**
 *
 * @author t.baiense
 */
public enum Porte {
    PEQUENO ("Pequeno"),
    MEDIO ("Médio"),
    GRANDE ("Grande");
    
    public final String texto;
    
    private Porte(String texto) {
        this.texto = texto;
    }
    
    public String getTexto() {
        return this.texto;
    }
}
