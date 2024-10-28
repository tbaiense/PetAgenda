package petagenda;

import petagenda.bd.BD;
import petagenda.dados.*;

public class PetAgenda {
    
    public static void main(String[] args) {
        Endereco teste = new Endereco(3, "Rua clarício ", "152", "América", "LKFJALSDJF", "12345673");
        BD.Endereco.update(teste);
//        teste.setId(3);
//        BD.Endereco.delete(teste);
        
        
    }
    
}
 