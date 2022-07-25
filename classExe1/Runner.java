package classExe1;

class Runner{

    public static void main(String[] args){

        Worker w1 = new Worker(2,"Ahmad","0541234562","developer",27000.0);
        // first way 
        // String temp = w1.getName();
        // Employee e1 = new Employee(3, temp+" : Tamara", "1283123", "employee", 80760.0);

        Employee e1 = new Employee(2,"Tamara","0541231231","HR manager","HR","Mahmoud",27000.0);
        String[] staff = {"Adam","Ali","Aya"};
        Onwer o1 = new Onwer(3, "Mahmoud", "05412312", "CTO",808600,staff);
        System.out.println(w1);
        System.out.println(e1);
        System.out.println(o1);
    }
}