package com.company;

public class Figure {
    private double Width;
    private double Heigth;

    //constructor
    public  Figure(double W,double H){
        this.Width = W;
        this.Heigth = H;
    }

    //getters
    public double getWidth(){
        return Width;
    }
    public double getHeigth(){
        return Heigth;
    }

    //setters
    public void setWidth(double W){
        this.Width = W;
    }
    public void setHeigth(double H){
        this.Heigth = H;
    }

    //methods
    public double area(double W, double H){
        return W*H;
    }
    public double perimeter(double W, double H){
        return (2*W) + (2*H);
    }
}
