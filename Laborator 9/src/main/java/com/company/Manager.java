package com.company;

import com.company.entity.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.Date;
import java.sql.SQLException;

public class Manager {


    public static void main(String[] args) throws SQLException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Laborator 9");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        Movie firstMovie = new Movie("Civil War", Date.valueOf("2016-05-06"), 148, 7.8);
        manager.persist(firstMovie);
        manager.getTransaction().commit();
        manager.close();
        factory.close();
    }

}
