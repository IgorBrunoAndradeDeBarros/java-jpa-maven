package com.igor.jpamaven.aplicacao;

import com.igor.jpamaven.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class programaBusca {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        Pessoa p = em.find(Pessoa.class, 1);
        System.out.println(p);

        System.out.println("Pronto");
        em.close();
        emf.close();
    }
}
