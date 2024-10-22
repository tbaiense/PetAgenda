package com.mycompany.petagenda;

import petagenda.bd.BD;
import petagenda.servico.TipoServico;
import java.util.Arrays;

public class PetAgenda {

    public static void main(String[] args) {
        TipoServico.init();
        System.out.print(Arrays.toString(TipoServico.values()));
    }
}
