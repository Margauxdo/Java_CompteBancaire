package org.example.IHM;

import org.example.entity.Client;
import org.example.repository.RepositoryClient;

import java.util.List;
import java.util.Scanner;

public class ClientIHM {

    private Scanner sc;
    private RepositoryClient repositoryClient;

    public ClientIHM() {
        sc = new Scanner(System.in);
        repositoryClient = new RepositoryClient();
    }

    public void Start(){
        String command;
        while(true){
            System.out.println("---Client Menu---");
            System.out.println("1. Create Client");
            System.out.println("2. Search Client");
            System.out.println("3. Display all Client");
            System.out.println("4. Update Client");
            System.out.println("5. Delete Client");
            System.out.println("6. Exit");
            command = sc.nextLine();
            switch(command){
                case "1"-> createClient();
                case "2"-> displayClientByID();
                case "3"-> displayAllClient();
                case "4"-> updateClient();
                case "5"-> deleteClient();
                default->{
                    System.out.println("invalid command");
                    return;
                }
            }
        }
    }

    private void createClient(){
        try {
            System.out.println("---create Client---");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("First Name: ");
            String firstName = sc.nextLine();
            System.out.println("Phone: ");
            String phone = sc.nextLine();

            Client client = Client.builder()
                    .name(name)
                    .firstname(firstName)
                    .phone(phone)
                    .build();
            client = repositoryClient.createClient(client);
            System.out.println("client : " + client);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    private void displayAllClient(){
        try {
            System.out.println("---Show all Clients---");
            List<Client> clients = repositoryClient.findAllClient();
            clients.forEach(System.out::println);
        }catch (Exception e){
            System.out.println(e.getMessage());;
        }

    }
    private void displayClientByID() {
        try{
            System.out.println("---Show Client by ID---");
            System.out.println("Id : ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println(repositoryClient.findClientById(id));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    private void updateClient(){

        try{
            System.out.println("---Update Client---");
            System.out.println("ID : ");
            int id = Integer.parseInt(sc.nextLine());

            Client client = repositoryClient.findClientById(id);

            if(client == null){
                System.out.println("client not found ! ");
                return;
            }

            System.out.println("Name : " + client.getName());
            System.out.println("entry the name of the client");
            String name = sc.nextLine();
            client.setName(name);
            System.out.println("First Name : " + client.getFirstname());
            System.out.println("entry the first name of the client");
            String firstname = sc.nextLine();
            client.setFirstname(firstname);
            System.out.println("Phone : " + client.getPhone());
            System.out.println("entry the phone of the client");
            String phone = sc.nextLine();
            client.setPhone(phone);

            client=repositoryClient.updateClient(client);
            System.out.println("Update Client : " + client);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void deleteClient(){
        try{
            System.out.println("---Delete Client---");
            System.out.println("ID : ");
            int id = Integer.parseInt(sc.nextLine());
            Client client = repositoryClient.findClientById(id);
            if (client != null){
                repositoryClient.deleteClient(client);
                System.out.println("client deleted !!");
            }else {
                System.out.println("client not found!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());;
        }
    }

}
