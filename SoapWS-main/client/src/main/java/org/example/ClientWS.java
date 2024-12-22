package org.example;

import proxy.BankAccount;
import proxy.BankService;
import proxy.BankWS;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BankService proxy = new BankWS().getBankServicePort();

        System.out.println(proxy.convertEuroToDh(542));

        System.out.println("--------------");
        BankAccount acc = proxy.getBankAccount(4);
        System.out.println("Account ID: " + acc.getId());
        System.out.println("Account balance: " + acc.getBalance());
        System.out.println("--------------");
        List<BankAccount> accountsList = proxy.getBankAccounts();
        System.out.println("Accounts :");
        for (BankAccount account : accountsList) {
            System.out.println("Account ID: " + account.getId());
            System.out.println("Account balance: " + account.getBalance());
            System.out.println("Account creation date: " + account.getCreationDate());
            System.out.println("------");
        }
    }
}