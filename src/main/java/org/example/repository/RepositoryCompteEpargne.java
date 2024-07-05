package org.example.repository;

import org.example.entity.Client;
import org.example.entity.CompteEpargne;
import org.example.util.SessionfactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
//TODO ajouter try/catch pour tous les CRUD / tous les repo

public class RepositoryCompteEpargne {
    private SessionFactory sessionFactory;
    private Session session;

    public RepositoryCompteEpargne() {
        sessionFactory = SessionfactorySingleton.getSessionFactory();
    }

    public CompteEpargne createCompteEpargne(CompteEpargne compteEpargne) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(compteEpargne);
            session.getTransaction().commit();
            return compteEpargne;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();

        }
    }

    public CompteEpargne findCompteEpargneById(int id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        CompteEpargne compteEpargne = session.get(CompteEpargne.class, id);
        session.getTransaction().commit();
        session.close();
        return compteEpargne;

    }

    public List<CompteEpargne> findAllCompteEpargne() {

        session = sessionFactory.openSession();
        session.beginTransaction();
        List<CompteEpargne> compteEpargnes = session.createQuery("select C from CompteEpargne as C", CompteEpargne.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return compteEpargnes;
    }

    public CompteEpargne updateCompteEpargne(CompteEpargne compteEpargne) {

        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(compteEpargne);
        session.getTransaction().commit();
        return compteEpargne;
    }

    public CompteEpargne deleteCompteEpargne(CompteEpargne compteEpargne) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(compteEpargne);
        session.getTransaction().commit();
        session.close();
        return compteEpargne;
    }
}
