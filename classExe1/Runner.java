package classExe1;

class Runner{
    // AUX. METHODS
    /*
    * Method returns random references for abstract person class
    * Worker, Employee and Owner
    * (9) objects
    * */
    private static Person[] initPersons(){

        Worker w1 = new Worker(2,"Ahmad","0541234562","Back-End Developer",31000.0);
        Worker w2 = new Worker(2,"Majed","0541234562","Front-End Developer",22000.0);
        Worker w3 = new Worker(2,"Adam","0541234562","QA engineer",34323.0);

        Employee e1 = new Employee(2,"Aya","0541231231","project manager","HR","Mahmoud",17882.0);
        Employee e2 = new Employee(2,"Tamarah","0541231231","HR manager","HR","Asaad",15992.0);
        Employee e3 = new Employee(2,"Mariam","0541231231","QA team leader","HR","Heba",21998.0);

        String[] staff1 = {"Adam","Ali","Hamzeh"};
        String[] staff2 = {"Ahmad","Mariam","Aya"};
        String[] staff3 = {"Taimaa","Abdallah","Helanah"};
        Onwer o1 = new Onwer(3, "Mahmoud", "05412312", "CTO",871273.0,staff1);
        Onwer o2 = new Onwer(3, "Asaad", "05412312", "Co-founder",54323.0,staff2);
        Onwer o3 = new Onwer(3, "Heba", "05412312", "CTO",412442.0,staff3);

        Person[] persons = {w1,w2,w3,e1,e2,e3,o1,o2,o3};

        return persons;
    }
    // methods print all persons
    private static void printAllPersons(Person[] persons){
        System.out.println("The persons we have:");
       for(int i =0 ;i < persons.length ; ++i){
           System.out.println(i+" : "+persons[i].toString());
       }
    }
    public static void main(String[] args){

//        Worker w1 = new Worker(2,"Ahmad","0541234562","developer",27000.0);
//        // first way
//        // String temp = w1.getName();
//        // Employee e1 = new Employee(3, temp+" : Tamara", "1283123", "employee", 80760.0);
//
//        Employee e1 = new Employee(2,"Tamara","0541231231","HR manager","HR","Mahmoud",27000.0);
//        String[] staff = {"Adam","Ali","Aya"};
//        Onwer o1 = new Onwer(3, "Mahmoud", "05412312", "CTO",808600,staff);
//        System.out.println(w1);
//        System.out.println(e1);
//        System.out.println(o1);

        System.out.println("==================== abstract class example=============");
        Person[] persons = initPersons();
        printAllPersons(persons);
        System.out.println("==================== instanceof example =============");
        // for example: instanceof keyword
        // definition: instanceof is a keyword in java language to detect the type of object
        // I want to print all Employees objects without Worker and Owners objects, How we can do it?
        //1.iterate on all persons
        //2.if condition using instanceof if type of object is Employee print details else skip [just pass]
        for(int i =0 ;i < persons.length;++i){
            Person currPerson = persons[i];
            if( currPerson instanceof Employee){
                //inside this scope just enter the Worker Person Why? Because I used in [instanceof]
                System.out.println(i+" : "+currPerson);
            }
        }


    }
}