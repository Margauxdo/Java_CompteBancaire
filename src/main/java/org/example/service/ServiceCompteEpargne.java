package org.example.service;

import org.example.entity.CompteCourant;
import org.example.entity.CompteEpargne;
import org.example.repository.RepositoryCompteCourant;
import org.example.repository.RepositoryCompteEpargne;
import org.hibernate.Session;

import java.util.List;

public class ServiceCompteEpargne {

    private RepositoryCompteEpargne repositoryCompteEpargne;
    private Session session;

    public ServiceCompteEpargne() {
        this.repositoryCompteEpargne = new RepositoryCompteEpargne();

    }

    public CompteEpargne createCompteEpargne(CompteEpargne compteEpargne) {
        return repositoryCompteEpargne.createCompteEpargne(compteEpargne);
    }

    public CompteEpargne findCompteEpargneById(int id) {
        return repositoryCompteEpargne.findCompteEpargneById(id);
    }

    public List<CompteEpargne> findAllCompteEpargne() {
        return repositoryCompteEpargne.findAllCompteEpargne();
    }

    public CompteEpargne updateCompteEpargne(CompteEpargne compteEpargne) {
        return repositoryCompteEpargne.updateCompteEpargne(compteEpargne);
    }

    public CompteEpargne deleteCompteEpargne(CompteEpargne compteEpargne) {
        return repositoryCompteEpargne.deleteCompteEpargne(compteEpargne);
    }

}