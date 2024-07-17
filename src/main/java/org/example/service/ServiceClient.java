package org.example.service;

import org.example.entity.Client;
import org.example.repository.RepositoryClient;
import org.hibernate.Session;

import java.util.List;

public class ServiceClient {

    private RepositoryClient repositoryClient;
    private Session session;

    public ServiceClient() {
        this.repositoryClient = new RepositoryClient();
    }

    public Client createClient(Client client) {
        return repositoryClient.createClient(client);
    }
    public Client findClientById(int id) {
        return repositoryClient.findClientById(id);
    }
    public List<Client> findAllClients() {
        return repositoryClient.findAllClient();
    }
    public Client updateClient(Client client) {
        return repositoryClient.updateClient(client);

    }
    public void deleteClient(Client client) {
        repositoryClient.deleteClient(client);

    }
}
