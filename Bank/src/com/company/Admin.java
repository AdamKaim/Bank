package com.company;

public class Admin extends Account {
    public Admin()
    {

    }
    public Admin(int i, String name, String surname, String mail, String password, String password2, int age, Long number, Long pesel) {
        super(i, name, surname, mail, password, password2, age, number, pesel);
    }
    public Account admin()
    {Admin admin =  new Admin(999 ,"Admin","Admin","Admin,","Admin","Admin",22,0L,0L);
        return admin;
    }
    void PannelAdmin() {
        do
            {
                mail2 = scan.nextLine();
                password3 = scan.nextLine();
            }
        while (mail2.equals("Admin")==false || password3.equals("Admin")==false) ;

            int s;
            do {
                System.out.println("--------------AdminPannel-----------------");
                System.out.println("Hallo " + admin().Name);
                System.out.println("Choose options!");
                System.out.println("0. Exit");
                System.out.println("1. Display All Account");
                System.out.println("2. Search Account ID ");
                System.out.println("3. Remove Account ID ");
                System.out.println("--------------AdminPannel-----------------");
                s = scan.nextInt();
                String cos=scan.nextLine();
                switch (s) {
                    case 0: {
                        System.out.println("You are Exit!");
                        mail2=" ";
                        password3=" ";
                    }
                    break;
                    case 1: {
                        Wyswietlnie();
                    }
                    break;
                    case 2: {
                        Search();
                    }
                    break;
                    case 3:
                    {
                        DeleteAccount();
                    }
                    default: {
                    }
                    break;
                }
            } while (s != 0);
    }
    void Search()
    {
        System.out.println("Account ID");
        tmp=scan.nextInt();
        String cos=scan.nextLine();
        System.out.println("--------------Account------------------");
        System.out.println("|    ID: "+account.get(tmp).i);
        System.out.println("|    Name: "+account.get(tmp).Name);
        System.out.println("|    Surname: "+account.get(tmp).Surname);
        System.out.println("|    Mail: "+account.get(tmp).mail );
        System.out.println("|    Password: "+account.get(tmp).password);
        System.out.println("|    Age: "+account.get(tmp).Age );
        System.out.println("|    Number: "+account.get(tmp).Number);
        System.out.println("|    Pesel: "+account.get(tmp).Pesel);
        System.out.println("--------------Account------------------");
    }
    void DeleteAccount()
    {
        System.out.println("Enter ID:");
        tmp=scan.nextInt();
        String cos=scan.nextLine();
        account.remove(tmp);
        System.out.println("Account ID "+ tmp+ " was removed!");
    }
}