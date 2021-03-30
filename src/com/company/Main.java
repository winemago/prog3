package com.company;

public class Main {
//es necesario el this.//dos unicas  maneras de inicialirar objs con constructor
    public static void main(String[] args) {
	    /*Figure rectangule = new Figure(20.5,10);                                                  //1

        System.out.println("width: " + rectangule.getWidth() + " height: " + rectangule.getHeigth());

        System.out.println("area: " + rectangule.area(rectangule.getWidth(),rectangule.getHeigth()) +" perimeter "+ rectangule.perimeter(rectangule.getWidth(),rectangule.getHeigth()));

	    rectangule.setWidth(14.5);
	    rectangule.setHeigth(7);

        System.out.println("width: " + rectangule.getWidth() + " height: " + rectangule.getHeigth());

        System.out.println("area: " + rectangule.area(rectangule.getWidth(),rectangule.getHeigth()) +" perimeter "+ rectangule.perimeter(rectangule.getWidth(),rectangule.getHeigth()));
*/

/*      Employee x = new Employee(23456345,"Carlos","Gutierrez",25000);                             //2
        Employee y = new Employee(34234123,"Ana","Sanchez",27500);

        System.out.println("employee: " + x.getName() + x.getLastname() + " Dni: " + x.getDni() + " Salary: " + "$" + x.getSalary() );
        System.out.println("employee: " + y.getName() + y.getLastname() + " Dni: " + y.getDni() + " Salary: " + "$" + y.getSalary() );

        System.out.println("annualy salary with increase: " +"$"+ x.increaseSal(15));

 */
                                                                                                    //4
 /*       ChekingAccount x = new ChekingAccount(123,"jorge",15000);

        System.out.println(x.credit(25000));

        x.buy(1500);
        x.buy(30000);
        x.buy(10000);

        x.Account();
*/

                                                                                                    //5
        Time clock = new Time(13,4,22);

        clock.PrintClock();

        clock.OnesecMore();
        clock.PrintClock();

        clock.OnesecLess();
        clock.PrintClock();

    }
}
