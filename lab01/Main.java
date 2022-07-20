package lab01;

class Main{
    public static void main(String [] args){
        /* ====================== Query 1,2 ====================== */
        System.out.println("=========== Query 1,2 ===========");

        Printer p = new Printer();
        
        System.out.println(p);
        System.out.println(p.getVisitors()+2);
        System.out.println(p.getVisitors());
        /*  ●	What happens when adding just visitors+2?
         *  if you mean +2 in print line we print the new value 5+2
         *  but if you mean +2 in toString method , so will print 52 chain of string because we started with string   
         */

        /*  ●	What is the right way of updating the print line?
           I think the best way to increment number of visitors is to define a getter/setter of visitors  
           to get the value using getter method
           and to update the value using setter method 
           becuase we don't want to beak down the encapsulation concept 
           I prefer to define new function taht recieved the value we are going to insert to visitors (such as 2),
           and if we wand the current value usign getter method
           and finally then update the visitors usign setter methods 
         */

        /* ================================================================== */

        /* ====================== Query 3 ====================== */
        System.out.println("=========== Query 3 ===========");

        Test test = new Test();
        System.out.println(test);
        System.out.println("The sum is: "+test.sum());
        System.out.println("The abg is: "+test.avg());
        System.out.println("The area of reactangle is: "+test.areaRectangle());
        System.out.println("The remainder of first number divided in 10 is: "+test.remainderFirstNumDividedBy10());
        System.out.println("The remainder of secound number divided in 10 is: "+test.remainderSecNumDividedBy10());

        /* ================================================================== */
        /* ====================== Query 4 ====================== */
        System.out.println("=========== Query 4 ===========");

        Test2  test1 = new Test2();
        System.out.println(test1);
        System.out.println(test1.printTime());

    
        /* ====================== Query 5 ====================== */
        System.out.println("=========== Query 5 ===========");

        Test3  test3 = new Test3();
        System.out.println(test3);
        System.out.println("The max number is: "+test3.getMax());



    }
}
