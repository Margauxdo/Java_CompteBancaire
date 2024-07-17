package org.example.IHM;

import org.example.entity.*;
import org.example.repository.RepositoryClient;
import org.example.repository.RepositoryCompteCourant;
import org.example.repository.RepositoryCompteEpargne;
import org.example.repository.RepositoryComptePayant;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CompteBancaireIHM {
    private Scanner sc;
    private RepositoryClient repositoryClient;
    private RepositoryCompteCourant repositoryCompteCourant;
    private RepositoryCompteEpargne repositoryCompteEpargne;
    private RepositoryComptePayant repositoryComptePayant;

    public CompteBancaireIHM() {
        sc = new Scanner(System.in);
        repositoryClient = new RepositoryClient();
        repositoryCompteCourant = new RepositoryCompteCourant();
        repositoryCompteEpargne = new RepositoryCompteEpargne();
        repositoryComptePayant = new RepositoryComptePayant();

    }

    public void Start() {
        String command;
        while (true) {
            System.out.println("--- Bank Account Menu ---");
            System.out.println("1/Current Account");
            System.out.println("2/Savings Account");
            System.out.println("3/Paid Account");
            System.out.println("4/Exit");
            command = sc.nextLine();
            switch (command) {
                case "1" -> currentAccountMenu();
                case  "2" -> savingsAccountMenu();
                case  "3" -> paidAccountMenu();
                default -> {
                    System.out.println("Invalid command");
                    return;
                }
            }
        }
    }


    public void currentAccountMenu() {
        String command;
        while (true) {
            System.out.println("--- Current Account Menu ---");
            System.out.println("1/ Create account");
            System.out.println("2/ search account");
            System.out.println("3/ display account");
            System.out.println("4/ update account");
            System.out.println("5/ delete account");
            System.out.println("6/ exit");
            command = sc.nextLine();
            switch (command) {
                case "1" -> createCurrentAccount();
                case "2" -> displayAllCurrentAccount();
                case "3" -> displayCurrentAccountByID();
                case "4" -> updateCurrentAccount();
                case "5" -> deleteCurrentAccount();
                default -> {
                    System.out.println("Invalid command");
                    return;

                }

            }
        }
    }

    public void savingsAccountMenu() {
        String command;
        while (true) {
            System.out.println("--- Savings Account Menu ---");
            System.out.println("1/ Create account");
            System.out.println("2/ search account");
            System.out.println("3/ display account");
            System.out.println("4/ update account");
            System.out.println("5/ delete account");
            System.out.println("6/ exit");
            command = sc.nextLine();
            switch (command) {
                case "1" -> createSavingsAccount();
                case "2" -> displayAllSavingsAccount();
                case "3" -> displaySavingsAccountByID();
                case "4" -> updateSavingsAccount();
                case "5" -> deleteSavingsAccount();
                default -> {
                    System.out.println("Invalid command");
                    return;

                }

            }
        }
    }

    public void paidAccountMenu() {
        String command;
        while (true) {
            System.out.println("--- Paid Account Menu ---");
            System.out.println("1/ Create account");
            System.out.println("2/ search account");
            System.out.println("3/ display account");
            System.out.println("4/ update account");
            System.out.println("5/ delete account");
            System.out.println("6/ exit");
            command = sc.nextLine();
            switch (command) {
                case "1" -> createPaidAccount();
                case "2" -> displayAllPaidAccount();
                case "3" -> displayPaidAccountByID();
                case "4" -> updatePaidAccount();
                case "5" -> deletePaidAccount();
                default -> {
                    System.out.println("Invalid command");
                    return;

                }

            }
        }
    }




    private void createCurrentAccount(){

        try{

            System.out.println("--- Create Current Account---");
            System.out.println("---create current account---");
            System.out.println("Pay: ");
           int pay = sc.nextInt();
            System.out.println("Operation: ");
            String operations;
            operations = sc.nextLine();

            CompteCourant compteCourant = CompteCourant.builder()
                    .pay(pay)
                    .build();
            compteCourant = repositoryCompteCourant.createCompteCourant(compteCourant);
            System.out.println("current account : " + compteCourant);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayAllCurrentAccount(){

        try{
            System.out.println("---Show all Current account---");
            List<CompteCourant> compteCourants= repositoryCompteCourant.findAllCompteCourants();
            compteCourants.forEach(System.out::println);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayCurrentAccountByID(){

        try{

            System.out.println("--- Display Current Account by ID---");
            System.out.println("---Show current account by ID---");
            System.out.println("Id : ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println(repositoryClient.findClientById(id));


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void updateCurrentAccount(){

        try{
            System.out.println("---Update Current account---");
            System.out.println("ID : ");
            int id = Integer.parseInt(sc.nextLine());

            CompteCourant compteCourant = repositoryCompteCourant.findCompteCourantById(id);

            if(compteCourant == null){
                System.out.println("current account not found ! ");
                return;
            }

            System.out.println("Pay : " + compteCourant.getPay());
            System.out.println("entry the current account ");
            int Pay = sc.nextInt();
            compteCourant.setPay(Pay);


            compteCourant =repositoryCompteCourant.updateCompteCourant(compteCourant);
            System.out.println("Update current account : " + compteCourant);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void deleteCurrentAccount() {

        try {
            System.out.println("---Delete Current account---");
            System.out.println("ID : ");
            int id = Integer.parseInt(sc.nextLine());
            CompteCourant compteCourant = repositoryCompteCourant.findCompteCourantById(id);
            if (compteCourant != null) {
                repositoryCompteCourant.deleteCompteCourant(compteCourant);
                System.out.println("current account deleted !!");
            } else {
                System.out.println("current account not found!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }




    private void createSavingsAccount(){

        try{
            System.out.println("--- Create savings Account---");

            System.out.println("Pay: ");
            int pay = sc.nextInt();
            System.out.println("Operation: ");
            String operations;
            operations = sc.nextLine();

            CompteEpargne compteEpargne = CompteEpargne.builder()
                    .pay(pay)
                    .build();
            compteEpargne = repositoryCompteEpargne.createCompteEpargne(compteEpargne);
            System.out.println("savings account : " + compteEpargne);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayAllSavingsAccount(){

        try{
            System.out.println("---Show all Savings account---");
            List<CompteEpargne> compteEpargnes= repositoryCompteEpargne.findAllCompteEpargne();
            compteEpargnes.forEach(System.out::println);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displaySavingsAccountByID(){

        try{

            System.out.println("--- Display Savings Account by ID---");

            System.out.println("Id : ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println(repositoryCompteEpargne.findCompteEpargneById(id));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void updateSavingsAccount(){

        try{
            System.out.println("---Update savings account---");
            System.out.println("ID : ");
            int id = Integer.parseInt(sc.nextLine());

            CompteEpargne compteEpargne = repositoryCompteEpargne.findCompteEpargneById(id);

            if(compteEpargne == null){
                System.out.println("savings account not found ! ");
                return;
            }

            System.out.println("Pay : " + compteEpargne.getPay());
            System.out.println("entry the savings account ");
            int Pay = sc.nextInt();
            compteEpargne.setPay(Pay);


            compteEpargne =repositoryCompteEpargne.updateCompteEpargne(compteEpargne);
            System.out.println("Update savings account : " + compteEpargne);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void deleteSavingsAccount(){

        try{

            System.out.println("---Delete savings account---");
            System.out.println("ID : ");
            int id = Integer.parseInt(sc.nextLine());
            CompteEpargne compteEpargne= repositoryCompteEpargne.findCompteEpargneById(id);
            if (compteEpargne != null) {
                repositoryCompteEpargne.deleteCompteEpargne(compteEpargne);
                System.out.println("savings account deleted !!");
            } else {
                System.out.println("savings account not found!");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    private void createPaidAccount(){

        try{

            System.out.println("--- Create paid Account---");

            System.out.println("Pay: ");
            int pay = sc.nextInt();
            System.out.println("Operation: ");
            String operations;
            operations = sc.nextLine();

            ComptePayant comptePayant = ComptePayant.builder()
                    .pay(pay)
                    .build();
            comptePayant = repositoryComptePayant.createComptePayant(comptePayant);
            System.out.println("paid account : " + comptePayant);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayAllPaidAccount(){

        try{
            System.out.println("---Show all Paid account---");
            List<ComptePayant> comptePayants= repositoryComptePayant.findAllComptePayants();
            comptePayants.forEach(System.out::println);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayPaidAccountByID(){

        try{

            System.out.println("--- Display Paid Account by ID---");

            System.out.println("Id : ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.println(repositoryComptePayant.findComptePayantById(id));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void updatePaidAccount(){

        try{
            System.out.println("---Update paid account---");
            System.out.println("ID : ");
            int id = Integer.parseInt(sc.nextLine());

            ComptePayant comptePayant = repositoryComptePayant.findComptePayantById(id);

            if(comptePayant == null){
                System.out.println("pay account not found ! ");
                return;
            }

            System.out.println("Pay : " + comptePayant.getPay());
            System.out.println("entry the pay account ");
            int Pay = sc.nextInt();
            comptePayant.setPay(Pay);


            comptePayant =repositoryComptePayant.updateComptesPayants(comptePayant);
            System.out.println("Update pay account : " + comptePayant);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void deletePaidAccount(){

        try{

            System.out.println("---Delete pay account---");
            System.out.println("ID : ");
            int id = Integer.parseInt(sc.nextLine());
            ComptePayant comptePayant = repositoryComptePayant.findComptePayantById(id);
            if (comptePayant != null) {
                repositoryComptePayant.deleteComptePayants(comptePayant);
                System.out.println("pay account deleted !!");
            } else {
                System.out.println("pay account not found!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

