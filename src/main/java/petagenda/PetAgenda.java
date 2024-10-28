package petagenda;

import java.util.Arrays;
import petagenda.bd.BD;
import petagenda.dados.*;

public class PetAgenda {
    
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Nova ", "001", "Bairro Legal", "Cidade do Povo", "11111111");
//        BD.Endereco.insert(endereco);
//        BD.Endereco.update(endereco);
//        teste.setId(3);
//        BD.Endereco.delete(endereco);
        
//        System.out.print(BD.Endereco.selectById(3));
//        System.out.print(Arrays.toString(BD.Endereco.selectAll()));

//        LocalAtuacao local = LocalAtuacao.valueOf(endereco);
//        BD.LocalAtuacao.insert(local);

//        LocalAtuacao novoLocal = new LocalAtuacao("Itaparica", "Vitória");
        LocalAtuacao localExistente = BD.LocalAtuacao.selectById(2);
        LocalAtuacao localExAlterado = new LocalAtuacao(localExistente.getId(), "Jardim Camburi", localExistente.CIDADE);
        BD.LocalAtuacao.update(localExAlterado);
        System.out.print(BD.LocalAtuacao.selectById(localExAlterado.getId()));
    }
    
}
 