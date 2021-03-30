package com.company;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ChekingAccount {
    private int ID;
    private String Name;
    private double  Balance;

    //constructor
    public ChekingAccount(int id, String name, double balance){
        ID = id;
        Name = name;
        Balance = balance;
    }

    //getters
    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public double getBalance() {
        return Balance;
    }

    //setters
    public void setName(String name) {
        Name = name;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    //methods
    public double credit(double Newbalance){
        double sum = Balance + Newbalance;
        setBalance(sum);
        return(getBalance());
    }
    public boolean debit(double Newbalance){
        boolean flag;
        if(Balance >= Newbalance) {
            double sum = Balance - Newbalance;
            setBalance(sum);

            return flag = true;
        }
        else{
           return flag = false;
        }
    }
    public void buy(double Newbalance){
        if(debit(Newbalance)) {
            System.out.println("Your account Nr: " + getID() + " was debited correctly. Available balance is $" + getBalance());
        }else{
            System.out.println("Your account doesn't have enough balance to withdraw.");
        }
    }

    public void Account(){
        System.out.println("ID: " + getID() + " Name: " + getName() + " Balance: " + getBalance());
    }

}
