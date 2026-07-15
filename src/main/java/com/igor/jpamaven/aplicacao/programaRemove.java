package com.igor.jpamaven.aplicacao;

import com.igor.jpamaven.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class programaRemove {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Pessoa pessoa = em.find(Pessoa.class, 1);
        em.remove(pessoa);

        em.getTransaction().commit();
        em.close();

        System.out.println("Pronto");
    }
}