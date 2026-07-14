package OOPS;

public class PasingclassToMethods {
    public static class car{
        int seats;  //These are Attributes of car class
        String name;
        double length;
        String type;
        int torque;

        void print(){ // class k andar function/methods bhi bana skte h aur usme class k attributes ko use kr skte h
            System.out.println("Name of car is " + name);
            System.out.println("Length of car is " + length);
            System.out.println("Type of car is " + type);
            System.out.println("Torque of car is " + torque);
        }

    }
    public static void main(String[] args) {
        
        car c1 = new car();
        c1.seats = 5;
        c1.name = "BMW";
        c1.length = 4.5;
        c1.type = "SUV";
        c1.torque = 400;

        change(c1);
        System.out.println(c1.name);

        c1.print();

    }
    public static void change(car c1) { //yaha agar c1 ki jagah x likhenge to bhi kaam karega kyuki c1 aur x dono hi car class ke object ko point kar rahe h
        c1.name = "Mercedes";
    }
}
