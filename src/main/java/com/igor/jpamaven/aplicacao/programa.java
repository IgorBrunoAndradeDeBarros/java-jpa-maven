package com.igor.jpamaven.aplicacao;

import com.igor.jpamaven.dominio.Pessoa;

public class programa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "carlitos", "carlo@gmail.com");
        Pessoa p2 = new Pessoa(1, "carluro", "carluro@gmail.com");
        Pessoa p3 = new Pessoa(1, "carbixo", "carbixo@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
