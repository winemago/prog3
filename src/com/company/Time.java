package com.company;

public class Time {
    private int Hour;
    private int Minute;
    private int Seconds;

    //constructor
    public Time(int H, int M, int S){
        Hour = setHour(H);
        Minute = setMinute(M);
        Seconds = setSeconds(S);
    }

    //getters
    public int getHour() {
        return Hour;
    }

    public int getMinute() {
        return Minute;
    }

    public int getSeconds() {
        return Seconds;
    }

    //setters
    public int setHour(int hour) {
        if(hour >= 0 && hour <= 23) {
            return Hour = hour;
        }else{
            return Hour = 0;
        }
    }

    public int setMinute(int minute) {
        if(minute >= 0 && minute <= 23) {
            return Minute = minute;
        }else
        {
            return Minute = 0;
        }
    }

    public int setSeconds(int seconds) {
        if(seconds  >= 0 && seconds<= 59) {
            return Seconds = seconds;
        }else{
            return Seconds = 0;
        }
    }

    //methods
    public void PrintClock(){
        System.out.println("---------------");
        if(Hour>=0 && Hour<=9){
            System.out.println("hh: 0" + Hour);
        }else{
            System.out.println("hh: " + Hour);
        }
        if(Minute>=0 && Minute<=9){
            System.out.println("mm: 0" + Minute);
        }else{
            System.out.println("mm: " + Minute);
        }
        if(Seconds>=0 && Seconds<=9){
            System.out.println("ss: 0" + Seconds);
        }else{
            System.out.println("ss: " + Seconds);
        }
        System.out.println("---------------");
    }

    public void OnesecMore(){
        setSeconds(++Seconds);
    }

    public void OnesecLess(){
        setSeconds(--Seconds);
    }
}
