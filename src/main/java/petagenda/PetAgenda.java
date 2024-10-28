package petagenda;

import petagenda.bd.BD;
import petagenda.dados.*;

public class PetAgenda {
    
    public static void main(String[] args) {
       BD.Endereco.insert(new Endereco("Rua clarício Antonio", "151", "Jardim América", "Cariacica", "12345678"));
    }
    
}
 