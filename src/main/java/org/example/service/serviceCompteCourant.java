package org.example.service;

import org.example.entity.CompteCourant;
import org.example.repository.RepositoryCompteCourant;
import org.hibernate.Session;

import java.util.List;

public class serviceCompteCourant {

    private RepositoryCompteCourant repositoryCompteCourant;
    private Session session;

    public serviceCompteCourant() {

        this.repositoryCompteCourant = new RepositoryCompteCourant();
    }

    public CompteCourant createCompteCourant(CompteCourant compteCourant) {
        return repositoryCompteCourant.createCompteCourant(compteCourant);
    }

    public CompteCourant findcompteCourant(int id) {
        return repositoryCompteCourant.findCompteCourantById(id);
    }
    public List<CompteCourant> findAllCompteCourant() {
        return repositoryCompteCourant.findAllCompteCourants();
    }
    public CompteCourant update(CompteCourant compteCourant) {
        return repositoryCompteCourant.updateCompteCourant(compteCourant);
    }
    public CompteCourant delete(CompteCourant compteCourant) {
        return repositoryCompteCourant.deleteCompteCourant(compteCourant);
    }

}
