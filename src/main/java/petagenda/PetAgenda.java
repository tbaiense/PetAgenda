package petagenda;

import petagenda.bd.BD;
import petagenda.servico.*;
import petagenda.dados.Endereco;
import java.util.Arrays;
import petagenda.dados.CPF;
import petagenda.dados.LocalAtuacao;
import petagenda.dados.Permissao;
import petagenda.exception.IllegalArgumentsException;

public class PetAgenda {

    public static void main(String[] args) {
        Usuario eu;
        try {
            
        } catch (IllegalArgumentsException exs) {
            Throwable[] causas = exs.getCauses(); // Exceções geradas pelo construtor por conta de argumentos inválidos
            System.out.println(Arrays.toString(causas)); // Printa as exceções se houver
        }
        
    }
}
 