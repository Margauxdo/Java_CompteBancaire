package org.example.IHM;

import org.example.entity.Client;
import org.example.entity.CompteCourant;
import org.example.entity.Operation;
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

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayAllCurrentAccount(){

        try{


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayCurrentAccountByID(){

        try{

            System.out.println("--- Display Current Account by ID---");


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void updateCurrentAccount(){

        try{


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void deleteCurrentAccount(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }



    private void createSavingsAccount(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayAllSavingsAccount(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displaySavingsAccountByID(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void updateSavingsAccount(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void deleteSavingsAccount(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    private void createPaidAccount(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayAllPaidAccount(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void displayPaidAccountByID(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void updatePaidAccount(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void deletePaidAccount(){

        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

