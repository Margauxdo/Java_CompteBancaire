package org.example.IHM;

import org.example.entity.Client;
import org.example.entity.CompteBancaire;
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
    public void Start(){
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
                case "2"-> displayAllOperation();
                case "3"-> displayOperationByID();
                case "4"-> updateOperation();
                case "5"-> deleteOperation();
                default -> {
                    System.out.println("Invalid command");
                    return;
                }
            }
        }
    }
    private void createOperation(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayAllOperation(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayOperationByID(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void updateOperation(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void deleteOperation(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
