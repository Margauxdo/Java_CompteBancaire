package org.example;

import org.example.repository.*;

public class Main {
    public static void main(String[] args) {

        RepositoryClient client = new RepositoryClient();

        RepositoryCompteCourant courant = new RepositoryCompteCourant();

        RepositoryCompteEpargne epargne = new RepositoryCompteEpargne();

        RepositoryComptePayant payant = new RepositoryComptePayant();

        RepositoryOperation operation = new RepositoryOperation();
    }
}