package org.example.repository;

import org.example.entity.Client;
import org.example.util.SessionfactorySingleton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class RepositoryClient {
    private SessionFactory sessionFactory;
    private Session session;

    public RepositoryClient() {
        sessionFactory = SessionfactorySingleton.getSessionFactory();
    }

    public Client createClient(Client client) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(client);
            session.getTransaction().commit();
            return client;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();

        }
    }

    public Client findClientById(int id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Client client = session.get(Client.class, id);
        session.getTransaction().commit();
        session.close();
        return client;

    }

    public List<Client> findAllClient() {

        session = sessionFactory.openSession();
        session.beginTransaction();
        List<Client> clients = session.createQuery("select C from Client as C", Client.class).getResultList();
        session.getTransaction().commit();
        session.close();
        return clients;
    }

    public Client updateClient(Client client) {

        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(client);
        session.getTransaction().commit();
        return client;
    }

    public Client deleteClient(Client client) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(client);
        session.getTransaction().commit();
        session.close();
        return client;
    }
}

