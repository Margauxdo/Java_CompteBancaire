package org.example;

import org.example.repository.RepositoryClient;
import org.example.repository.RepositoryCompteBancaire;
import org.example.repository.RepositoryOperation;

public class Main {
    public static void main(String[] args) {

        RepositoryClient client = new RepositoryClient();

        RepositoryCompteBancaire compteBancaire = new RepositoryCompteBancaire();

        RepositoryOperation operation = new RepositoryOperation();
    }
}