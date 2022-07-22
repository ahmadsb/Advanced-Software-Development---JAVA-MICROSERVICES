package lab02;

public class Main {
    public static void main(String [] args){
        /* ====================== Query 1 ====================== */
        System.out.println("=========== Query 1==========="); 
        Query1 query1 = new Query1();
        System.out.println(query1);
        if(query1.isEqual50()){
            System.out.println("Bingo!");
        }else if( query1.isBiggerFrom50()){
            System.out.println("Big!");
        }else{
            System.out.println("Small!");
        }
        /* ================================================================== */
        /* ====================== Query 2 ====================== */
        System.out.println("=========== Query 2==========="); 

        Query2 query2 = new Query2();
        System.out.println(query2);
        if( query2.isBiggerFrom50()){
            System.out.println("Big!");
        }else {
            System.out.println("Small!");
        }

        if(query2.isEven()){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        /* ====================== Query 3 ====================== */
        System.out.println("=========== Query 3==========="); 
        SalaryRaiser salaryRaiser = new SalaryRaiser();
        System.out.println(salaryRaiser);
        double raise = salaryRaiser.percentRaise();
        System.out.println("He deserves rais in : "+raise * 100 + "%, it's mean plus "+salaryRaiser.getSalary()*raise);
        System.out.println("The salary after raise is "+salaryRaiser.raiseSalary());
        

        /* ================================================================== */
        /* ====================== Query 4 ====================== */
        System.out.println("=========== Query 4==========="); 
        Query4 query4 = new Query4();
        System.out.println(query4);
        System.out.println("The bigger number is: "+query4.theBiggerNumIs());
    
        /* ====================== Query 5 ====================== */
        System.out.println("=========== Query 5==========="); 
        Query5 query5 = new Query5();
        System.out.println(query5);
        System.out.println("The smaller number is: "+query5.theSmallerNumIs());

       /* ====================== Query 6 ====================== */
       System.out.println("=========== Query 6==========="); 
       TaxCalculator taxCalculator = new TaxCalculator();
       System.out.println("The salary after tax is: "+taxCalculator);
       System.out.println("The salary after tax is: "+taxCalculator.salaryAfterTax());

        /* ====================== Query 7 ====================== */
        System.out.println("=========== Query 7==========="); 
        
        System.out.println("The salary after tax is: "+taxCalculator);
        System.out.println("The salary after tax is: "+taxCalculator.salaryAfterTax());
       /* ====================== Query 8 ====================== */
       System.out.println("=========== Query 8==========="); 
       Year year = new Year();
       System.out.println(year);
       System.out.println(year.isLeap());





    }

}
