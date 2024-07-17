package org.example.service;

import org.example.entity.ComptePayant;
import org.example.repository.RepositoryComptePayant;
import org.hibernate.Session;

import java.util.List;

public class ServiceComptePayant {

    private RepositoryComptePayant repositoryComptePayant;
    private Session session;

    public ServiceComptePayant() {
        this.repositoryComptePayant = new RepositoryComptePayant();
    }

    public ComptePayant createComptePayant(ComptePayant comptePayant) {
        return repositoryComptePayant.createComptePayant(comptePayant);
    }

    public ComptePayant findComptePayantById(int id) {
        return repositoryComptePayant.findComptePayantById(id);
    }
    public List<ComptePayant> findAllComptePayants() {
        return repositoryComptePayant.findAllComptePayants();
    }

    public ComptePayant updateComptePayant(ComptePayant comptePayant) {
        return repositoryComptePayant.updateComptesPayants(comptePayant);
    }

    public ComptePayant deleteComptePayant(ComptePayant comptePayant) {
        return  repositoryComptePayant.deleteComptePayants(comptePayant);
    }
}
