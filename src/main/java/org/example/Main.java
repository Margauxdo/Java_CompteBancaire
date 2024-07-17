package org.example;

import org.example.IHM.GlobalIHM;
import org.example.entity.Client;
import org.example.entity.Operation;
import org.example.repository.*;
import org.example.util.StatutOperation;

public class Main {
    public static void main(String[] args) {

        RepositoryClient repositoryClient = new RepositoryClient();

        RepositoryCompteCourant repositoryCompteCourant = new RepositoryCompteCourant();

        RepositoryCompteEpargne repositoryCompteEpargne = new RepositoryCompteEpargne();

        RepositoryComptePayant repositoryComptePayant = new RepositoryComptePayant();

        RepositoryOperation repositoryOperation = new RepositoryOperation();

        GlobalIHM globalIHM = new GlobalIHM();
        globalIHM.start();





    }
}