package org.example.IHM;

import org.example.entity.Client;
import org.example.repository.RepositoryClient;

import java.util.Scanner;

public class ClientIHM {
<<<<<<< HEAD
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
                case "1": createClient();
                case "2":
                default:{
                    System.out.println("invalid command");
                    return;
                }
            }
        }
    }

    private void createClient(){
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
        System.out.println("client : "+ client);


    }
=======

>>>>>>> 2d6ea4be5176e680efd113d3d30479322a5e7210
}
