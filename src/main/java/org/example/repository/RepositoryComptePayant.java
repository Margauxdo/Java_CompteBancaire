package org.example.repository;

import org.example.entity.Client;
import org.example.entity.CompteCourant;
import org.example.entity.ComptePayant;
import org.example.util.SessionfactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
//TODO ajouter try/catch pour tous les CRUD / tous les repo


public class RepositoryComptePayant {
    private SessionFactory sessionFactory;
    private Session session;
    public RepositoryComptePayant() {
        sessionFactory = SessionfactorySingleton.getSessionFactory();
    }

    public ComptePayant createComptePayant(ComptePayant comptePayant) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(comptePayant);
            session.getTransaction().commit();
            return comptePayant;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();

        }
    }

    public ComptePayant findComptePayantById(int id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        ComptePayant comptePayant = session.get(ComptePayant.class, id);
        session.getTransaction().commit();
        session.close();
        return comptePayant;

    }

    public List<ComptePayant> findAllComptePayants() {

        session = sessionFactory.openSession();
        session.beginTransaction();
        List<ComptePayant> comptePayants = session.createQuery("select C from ComptePayant as C", ComptePayant.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return comptePayants;
    }

    public ComptePayant updateComptesPayants(ComptePayant comptePayant) {

        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(comptePayant);
        session.getTransaction().commit();
        return comptePayant;
    }

    public ComptePayant deleteComptePayants(ComptePayant comptePayant) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(comptePayant);
        session.getTransaction().commit();
        session.close();
        return comptePayant;
    }
}
