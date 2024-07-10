package org.example.IHM;

import java.util.Scanner;

public class GlobalIHM {

    private Scanner sc = new Scanner(System.in);
    private ClientIHM clientIHM;
    private OperationIHM operationIHM;
    private CompteBancaireIHM compteBancaireIHM;

    public GlobalIHM() {
        clientIHM = new ClientIHM();
        operationIHM = new OperationIHM();
        compteBancaireIHM = new CompteBancaireIHM();
        sc = new Scanner(System.in);
    }

    public void start(){
        String command;
        while(true){
            System.out.println("---Main menu ---");
            System.out.println("1. Client");
            System.out.println("2. Operation");
            System.out.println("3. Compte");
            System.out.println("4. Exit");
            command = sc.nextLine();
            switch(command){
                case "1" -> clientIHM.Start();
                case "2" -> operationIHM.Start();
                case "3" -> compteBancaireIHM.Start();
                case "4" -> System.exit(0);
                default -> {
                    System.out.println("Invalid command");
                    return;
                }
            }
        }
    }
}
