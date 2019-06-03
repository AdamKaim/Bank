package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankAccount
{
    public BankAccount()
    {
        Balance = new BigDecimal("10000");
    }

    BigDecimal Balance;
    BigDecimal HowMuch;

    Scanner scan = new Scanner(System.in);
    public BigDecimal getBalance()
    {
        return Balance;
    }

    public boolean setBalance(BigDecimal Balance)
    {
        this.Balance = Balance;
        return true;
    }

    boolean pay()
    {
        System.out.println("HowMuch: ");
        HowMuch = scan.nextBigDecimal();
        if (Balance.compareTo(HowMuch) < 0)
            System.out.println("You dont have cash");
        else
            setBalance(Balance.subtract(HowMuch));
    return true;
    }
    boolean Deposit()
    {
        System.out.println("HowMuch: ");
        HowMuch = scan.nextBigDecimal();
        setBalance(Balance.add(HowMuch));
        return true;
    }
}