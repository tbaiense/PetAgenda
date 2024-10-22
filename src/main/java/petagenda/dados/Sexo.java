package petagenda.dados;

/**
 *
 * @author thiago
 */
public enum Sexo {
    M ("Macho", "Masculino"),
    F ("Fêmea", "Feminino");
    
    public final String PET;
    public final String HUMANO;
    
    private Sexo(String pet, String humano) {
        this.PET = pet;
        this.HUMANO = humano;
    }
}
