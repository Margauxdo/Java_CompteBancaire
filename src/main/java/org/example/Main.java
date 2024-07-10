package org.example;

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

        // OPERATION
//        Operation operation1 = Operation.builder()
//                .numberOperation(1)
//                .price(11.5f)
//                .statutOperation(StatutOperation.DEPOSIT)
//                .build();
//        Operation operation2 = Operation.builder()
//                .id(1)
//                .numberOperation(1)
//                .price(50f)
//                .statutOperation(StatutOperation.DEPOSIT)
//                .build();
//        repositoryOperation.createOperation(operation1);
//        System.out.println(repositoryOperation.findOperationById(1));
//      repositoryOperation.updateOperation(operation1);
//        System.out.println(repositoryOperation.findOperationById(1));
//        repositoryOperation.deleteOperation(operation1);
//        repositoryOperation.findAllOperation().forEach(System.out::println);





    }
}