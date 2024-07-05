package org.example.repository;

import org.example.entity.CompteCourant;
import org.example.util.SessionfactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
//TODO ajouter try/catch pour tous les CRUD / tous les repo


public class RepositoryCompteCourant {

    private SessionFactory sessionFactory;
    private Session session;
    public RepositoryCompteCourant() {
        sessionFactory = SessionfactorySingleton.getSessionFactory();
    }
    public CompteCourant createCompteCourant(CompteCourant compteCourant) {
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(compteCourant);
            session.getTransaction().commit();
            return compteCourant;
        }
        catch(Exception e){
            session.getTransaction().rollback();
            return null;
        }finally {
            session.close();
        }
    }

    public CompteCourant findCompteCourantById(int id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        CompteCourant compteCourant = session.get(CompteCourant.class, id);
        session.getTransaction().commit();
        session.close();
        return compteCourant;
    }
    public List<CompteCourant> findAllCompteCourants() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        List<CompteCourant> compteCourants = session.createQuery("select C from CompteCourant as C", CompteCourant.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return compteCourants;
    }

    public CompteCourant updateCompteCourant(CompteCourant compteCourant) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(compteCourant);
        session.getTransaction().commit();
        return compteCourant;
    }
    public CompteCourant deleteCompteCourant(CompteCourant compteCourant) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(compteCourant);
        session.getTransaction().commit();
        session.close();
        return compteCourant;
    }

}
