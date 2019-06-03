package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Account
{
    int tmp;
    public Account()
    {

    }
    public Account(int i, String name, String surname, String mail, String password, String password2, int age, Long number, Long pesel) {
        this.i = i;
        Name = name;
        Surname = surname;
        this.mail = mail;
        this.password = password;
        this.password2 = password2;
        Age = age;
        Number = number;
        Pesel = pesel;
    }
    BankAccount bankAccount = new BankAccount();
    int i=0;
    public static ArrayList<Account> account = new ArrayList();
    public String Name, Surname, mail, mail2, password, password2, password3;
    int Age;
    Long Number;
    Long Pesel;
    Scanner scan = new Scanner(System.in);



    public ArrayList<Account> Registration()
    {
        System.out.print("Age: ");
        Age = scan.nextInt();
        String cos = scan.nextLine();
        if (Age < 18)
        {
            System.out.println("You are not an adult!");
        }
        else {
            boolean created = false;
            System.out.println("ID: " + i);
            System.out.print("Name: ");
            Name = scan.nextLine();
            System.out.print("Surname: ");
            Surname = scan.nextLine();
            System.out.print("Password: ");
            password = scan.nextLine();
            System.out.print("Return Password: ");
            password2 = scan.nextLine();
            System.out.print("Mail: ");
            mail = scan.nextLine();
            System.out.print("Pesel: ");
            Pesel = scan.nextLong();
            System.out.print("Number: ");
            Number = scan.nextLong();
            String cos2 = scan.nextLine();
            if (password.equals(password2) == false) {
                do {
                    System.out.println("Error Password");
                    System.out.print("Password: ");
                    password = scan.nextLine();
                    System.out.print("Return Password: ");
                    password2 = scan.nextLine();
                } while (password.equals(password2) == false);
                System.out.println("account created");
                created = true;
            } else {
                System.out.println("account created");
                created = true;
            }
            if (created) {
                account.add(new Account(i, Name, Surname, mail, password, password2, Age, Number, Pesel));
                i++;
                return account;
            }
        }
        return account;
    }
    public void Wyswietlnie()
    {
        for(int i=0;i<account.size();i++)
        {
            System.out.println("--------------Account-----------------");
            System.out.println("|   ID: "+account.get(i).i);
            System.out.println("|   Name: "+account.get(i).Name);
            System.out.println("|   Surname: "+account.get(i).Surname);
            System.out.println("|   Mail: "+account.get(i).mail );
            System.out.println("|   Password: "+account.get(i).password);
            System.out.println("|   Age: "+account.get(i).Age );
            System.out.println("|   Number: "+account.get(i).Number);
            System.out.println("|   Pesel: "+account.get(i).Pesel);
            System.out.println("--------------Account-----------------");
        }
    }
    void Transfer()
    {
        BigDecimal HowMuch;
        System.out.println("Enter the destination account ID: ");
        int tmp2=scan.nextInt();
        if (tmp2 == tmp)
        {
            System.out.println("Error this same ID");
            do{
                System.out.println("Enter the destination account ID: ");
                tmp2=scan.nextInt();
            }while(tmp2==tmp);
        }
        else {
        System.out.println("Good ID");
        }
        System.out.println("HowMuch: ");
        HowMuch = scan.nextBigDecimal();
        if (account.get(tmp).bankAccount.Balance.compareTo(HowMuch) < 0)
            System.out.println("You dont have cash");
        else {
            account.get(tmp).bankAccount.setBalance(bankAccount.Balance.subtract(HowMuch));
        }
        account.get(tmp2).bankAccount.setBalance(bankAccount.Balance.add(HowMuch));
    }
    void Login()
    {
        BigDecimal HowMuch;
        int s;
        System.out.println("Account ID:");
        tmp=scan.nextInt();
        String cos=scan.nextLine();
        System.out.print("Mail: ");
        mail2 = scan.nextLine();
        System.out.print("Password: ");
        password3 = scan.nextLine();
        if (mail2.equals(account.get(tmp).mail) == false|| password3.equals(account.get(tmp).password)== false)
        {
            System.out.println("Mail or Password isn't true");
            do {
                System.out.print("Mail: ");
                mail2 = scan.nextLine();
                System.out.print("Password: ");
                password3 = scan.nextLine();
            }while(mail2.equals(account.get(tmp).mail) == false|| password3.equals(account.get(tmp).password)== false);
            System.out.println("You are login");

        }
        else
        {
            System.out.println("You are login");
        }
        do {
            System.out.println("Hallo " + account.get(tmp).Name + " " +  account.get(tmp).Surname);
            System.out.println("ID: "+account.get(tmp).i);
            System.out.println("Your account: " + account.get(tmp).bankAccount.Balance);
            System.out.println("Choose options");
            System.out.println("0. logout");
            System.out.println("1. Withdraw cash");
            System.out.println("2. Deposit cash");
            System.out.println("3. Transfer");
            s = scan.nextInt();
            switch (s) {
                case 0: {
                    System.out.println("You are Logout");
                }break;
                case 1: {
                    account.get(tmp).bankAccount.pay();
                }break;
                case 2:{
                    account.get(tmp).bankAccount.Deposit();
                }break;
                case 3:{
                    Transfer();
                }break;
                default:{
                }break;
            }
        }while (s!=0);
    }

}
