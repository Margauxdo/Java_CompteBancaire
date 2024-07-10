package org.example.IHM;

import org.example.repository.RepositoryClient;
import org.example.repository.RepositoryOperation;

import java.util.Scanner;

public class OperationIHM {
    private Scanner sc;
    private RepositoryOperation repositoryOperation;
    private RepositoryClient repositoryClient;

    public OperationIHM() {
        sc = new Scanner(System.in);
        repositoryOperation = new RepositoryOperation();
        repositoryClient = new RepositoryClient();

    }
    public void start(){
        String command;
        while(true){
            System.out.println("---Operation Menu ---");
            System.out.println("1- Create operation");
            System.out.println("2- Display operation");
            System.out.println("3- Display operation by id");
            System.out.println("4- update operation");
            System.out.println("5- Delete operation");
            System.out.println("6- Exit");
            command = sc.nextLine();
            switch(command){
                case "1"-> createOperation();
                case "2"-> displayOperation();
                case "3"-> displayOperation();
                case "4"-> displayOperationByID();
                case "5"-> updateOperation();
                case "6"-> deleteOperation();
                default -> {
                    System.out.println("Invalid command");
                    return;
                }
            }
        }
    }
    private void createOperation(){

    }
    private void displayOperation(){

    }
    private void displayOperationByID(){

    }
    private void updateOperation(){

    }
    private void deleteOperation(){

    }
}
