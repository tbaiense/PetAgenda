package petagenda;

import java.util.Arrays;
import petagenda.bd.BD;
import petagenda.dados.*;
import petagenda.servico.Servico;
import petagenda.servico.TipoServico;

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
//        LocalAtuacao localExistente = BD.LocalAtuacao.selectById(2);
//        LocalAtuacao localExAlterado = new LocalAtuacao(localExistente.getId(), "Jardim Camburi", localExistente.CIDADE);
//        BD.LocalAtuacao.update(localExAlterado);
//        System.out.print(BD.LocalAtuacao.selectById(localExAlterado.getId()));


//        TipoServico passeio = BD.TipoServico.selectById(2);
//        Servico servicoPresta = new Servico("Dog Petting", passeio, 60, 100.0);
//        BD.Servico.insert(servicoPresta);
//
//        System.out.println(BD.Servico.selectLast());

//        Servico lastServ = BD.Servico.selectLast();
//        Endereco end = new Endereco("Rua sdgsdfg", "g. 1", "fadsff Bonito", "asdfasdf do Povo", "13245678");
//        Endereco lastEnd = BD.Endereco.selectLast();
//        Cliente thiago = new Cliente("Maria", lastEnd, "40028922", lastServ);
//        BD.Cliente.insert(thiago);

//        BD.Cliente.delete(new Cliente(2, "Maria", lastEnd, "40028922", lastServ));

        System.out.println(BD.Usuario.selectById(7));
    }
    
}
 