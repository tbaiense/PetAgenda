package com.mycompany.petagenda;

import petagenda.bd.BD;
import petagenda.servico.*;
import petagenda.dados.Endereco;
import java.util.Arrays;
import petagenda.dados.Permissao;
import petagenda.exception.IllegalArgumentsException;

public class PetAgenda {

    public static void main(String[] args) {
        try {
           Permissao p = new Permissao(-1, ""); 
        } catch (IllegalArgumentsException exs) {
            System.out.println(Arrays.toString(exs.getCauses()));
        }
        
    }
}
