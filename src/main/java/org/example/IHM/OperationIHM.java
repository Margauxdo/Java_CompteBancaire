package org.example.IHM;

import org.example.entity.Client;
import org.example.entity.CompteBancaire;
import org.example.entity.Operation;
import org.example.repository.RepositoryClient;
import org.example.repository.RepositoryOperation;
import org.example.util.StatutOperation;

import java.util.List;
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
            System.out.println("---Create Operation ---");
            System.out.println("Number operation");
            int numberOperation = sc.nextInt();
            System.out.println("Price:");
            float priceOperation = sc.nextFloat();
            System.out.println("Statut operation:");
            StatutOperation statutOperation = StatutOperation.valueOf(sc.nextLine());

            Operation operation = Operation.builder()
                    .numberOperation(numberOperation)
                    .price(priceOperation)
                    .statutOperation(statutOperation)
                    .build();

            operation = repositoryOperation.createOperation(operation);
            System.out.println("operation created" + operation);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayAllOperation(){

        try{
            System.out.println("---Show all Operation ---");
            List<Operation> operationList = repositoryOperation.findAllOperation();
            operationList.forEach(System.out::println);
            } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayOperationByID(){

        try{
            System.out.println("---Show Operation by ID ---");
            System.out.println("ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println(repositoryOperation.findOperationById(id));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void updateOperation(){

        try{

            System.out.println("---Update Operation ---");
            System.out.println("ID: ");
            int id = Integer.parseInt(sc.nextLine());

            Operation operation = repositoryOperation.findOperationById(id);

            if(operation == null) {
                System.out.println("operation not found!!");
                return;
            }
            System.out.println("Number operation: "+operation.getNumberOperation());
            System.out.println("Entry the number of the operation");
            int numberOperation = sc.nextInt();
            operation.setNumberOperation(numberOperation);
            System.out.println("Price operation:"+operation.getPrice());
            System.out.println("enter the price of the operation");
            float priceOperation = sc.nextFloat();
            operation.setPrice(priceOperation);
            System.out.println("Status operation : " + operation.getStatutOperation());
            System.out.println("enter the status of the operation");
            StatutOperation statutOperation = StatutOperation.valueOf(sc.nextLine());
            operation.setStatutOperation(statutOperation);

            operation = repositoryOperation.updateOperation(operation);
            System.out.println("operation updated" + operation);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void deleteOperation(){

        try{
            System.out.println("---Delete Operation ---");
            System.out.println("ID: ");
            int id = Integer.parseInt(sc.nextLine());
            Operation operation = repositoryOperation.findOperationById(id);
            if(operation != null) {
                repositoryOperation.deleteOperation(operation);
                System.out.println("operation deleted" );
            }else {
                System.out.println("operation not found!!");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
