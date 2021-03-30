package com.company;

public class Employee {
    private int Dni;
    private String Name;
    private String Lastname;
    private double Salary;

    //constructor
    public Employee(int dni, String name, String lastname, double salary) {
        this.Dni = dni;
        this.Name = name;
        this.Lastname = lastname;
        this.Salary = salary;
    }

    //getter
    public int getDni() {
        return Dni;
    }

    public String getName() {
        return Name;
    }

    public String getLastname() {
        return Lastname;
    }

    public double getSalary() {
        return Salary;
    }

    //setter
    public void setDni(int dni) {
        Dni = dni;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    //methods
    public double AnnualSal(double sal){
        return sal*12;
    }

    public double increaseSal(double percentage){
        double rest = percentage/100;
        double  per = 1+rest;
        double total = AnnualSal(Salary)*per;
        return total;
    }


}

