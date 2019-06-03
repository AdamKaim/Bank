package com.company;

import java.lang.*;
import java.util.Scanner;

public class Bank
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a;
        Admin admin=new Admin();
        BankAccount bankAccount = new BankAccount();
        Account account = new Account();
        do {
            System.out.println(" ");
            System.out.println("--------------BankPAK-----------------");
            System.out.println("Hallo in Bank PAK");
            System.out.println("Choose number");
            System.out.println("1. Login");
            System.out.println("2. Registration");
            System.out.println("0. System Shut down");
            System.out.print("Your Choose: ");
            a = scan.nextInt();
            System.out.println("--------------BankPAK-----------------");
            String cos=scan.nextLine();
            switch (a) {
                case 1: {
                account.Login();
                }break;
                    case 2: {
                    account.Registration();
                }break;
                case 3:{
                   admin.PannelAdmin();
                }
                case 0: {
                System.out.println("System Shut down");
                }break;
                default: {
                System.out.println("default");
                }break;
            }
        }while (a != 0);
    }
}

