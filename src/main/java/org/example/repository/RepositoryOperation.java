package org.example.repository;

import org.example.entity.Client;
import org.example.entity.Operation;
import org.example.util.SessionfactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

    //TODO ajouter try/catch pour tous les CRUD / tous les repo
public class RepositoryOperation {
    private SessionFactory sessionFactory;
    private Session session;
    public RepositoryOperation() {
        sessionFactory = SessionfactorySingleton.getSessionFactory();

    }

    public Operation createOperation(Operation operation) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(operation);
            session.getTransaction().commit();
            return operation;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();

        }
    }

    public Operation findOperationById(int id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Operation operation = session.get(Operation.class, id);
        session.getTransaction().commit();
        session.close();
        return operation;

    }

    public List<Operation> findAllOperation() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        List<Operation> operations = session.createQuery("from Operation", Operation.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return operations;
    }

    public Operation updateOperation(Operation operation) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(operation);
        session.getTransaction().commit();
        session.close();
        return operation;
    }

    public Operation deleteOperation(Operation operation) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(operation);
        session.getTransaction().commit();
        session.close();
        return operation;
    }
}
