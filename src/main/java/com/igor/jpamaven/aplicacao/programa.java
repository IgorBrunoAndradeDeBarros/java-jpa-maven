package com.igor.jpamaven.aplicacao;

import com.igor.jpamaven.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class programa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "carlitos", "carlo@gmail.com");
        Pessoa p2 = new Pessoa(null, "carluro", "carluro@gmail.com");
        Pessoa p3 = new Pessoa(null, "carbixo", "carbixo@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();

        System.out.println("Pronto");
    }
}
