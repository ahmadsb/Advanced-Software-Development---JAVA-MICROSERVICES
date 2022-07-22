package lab03;

public class Main {
    private static void query1(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

    }
    // Aux. methods for query 2
    private static void printUsingIncForLoop(){
        System.out.println("========= using incremental For loop ===========");

        for(int i =0 ; i < 10 ; i++){
            System.out.println("Hello World");
        }
    }

    private static void printUsingDecForLoop(){
        System.out.println("========= using decremental  For loop ===========");

        for(int i =10 ; i>0 ; i--){
            System.out.println("Hello World");
        }
    }

    private static void printUsingIncWhileLoop(){
        System.out.println("========= using incremental While loop ===========");

        int i =0;
        while(i< 10){
            System.out.println("Hello World");
            i++;
        }
    }

    private static void printUsingDecWhileLoop(){
        System.out.println("========= using decremental  While loop ===========");
        int i =10;
        while(i>0){
            System.out.println("Hello World");
            i--;
        }
    }
    private static void query2(){
        printUsingIncForLoop();
        printUsingDecForLoop();
        printUsingIncWhileLoop();
        printUsingDecWhileLoop();

    }

    public static int howMany(char[] arr, char ch){
        int counter  =0;
        for(int i =0; i < arr.length ; ++i){
            if(arr[i] == ch)
                counter++;
        }

        return counter;
    }
    // howManyChars
    public static int howManyChars(char[] arr, char ch1,char ch2){
        int counter  =0;
        for(int i =0; i < arr.length ; ++i){
            if(arr[i] == ch1 || arr[i] == ch2)
                counter++;
        }

        return counter;
    }

    private static void printArray(char[] arr){
        int i =0;
        for(; i < arr.length-1 ; ++i){
           System.out.print(arr[i]+", ");
                
        }
        System.out.println(arr[i]);
    }

    public static char[] convertToCharArray(String str){
        char[] charArray = new char[str.length()];
        
        for(int i =0 ;i < str.length();++i){
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    public static void main(String[] args){
        System.out.println("============= query 1 =============");
        query1();
        System.out.println("============= query 2 =============");
        query2();
        System.out.println("============= query 3 =============");
        PrintNums printNums = new PrintNums();
        System.out.println(printNums);
        printNums.printAllNums();
        System.out.println("============= query 4 =============");
        Among among = new Among();
        System.out.println(among);
        among.printAomngBetweenThem();
        System.out.println("============= query 5 =============");
        EvenNum even = new EvenNum();
        System.out.println(even);
        even.printEvens();

        System.out.println("============= query 6 =============");
        NumDividedDen numDividedDen = new NumDividedDen();
        System.out.println(numDividedDen);
        numDividedDen.printNumsToMaxDividedByDen();

        System.out.println("============= query 7,8 =============");
        Factorial factorial = new Factorial();
        System.out.println(factorial);
        factorial.factorialNum();

        System.out.println("============= query 9,10,11,12,13,14 =============");
        Query9 query9 = new Query9();
        System.out.println(query9);
        System.out.println("The length digits of number is: "+query9.lengthOfDigits());
        System.out.println("The right digit is: "+query9.rightDigit());
        System.out.println("The left digit is: "+query9.leftDigit());
        System.out.println("The reverse number is: "+query9.reverse());
        System.out.println("The sum of digits is: "+query9.sumDigits());


        System.out.println("============= query 14 =============");
        Query14 query14 = new Query14();
        System.out.println(query14);
        System.out.println("is palindrome number? "+query14.isPalindrome());

        System.out.println("============= query 15 =============");
        Boom boom = new Boom();
        System.out.println(boom);
        boom.game();

        System.out.println("============= query 16.1 =============");
        Fibo fibo = new Fibo();
        System.out.println(fibo);
        fibo.printFibo();


        System.out.println("============= query 16.2 =============");
        Fibonacci fibonacci= new Fibonacci();
        System.out.println(fibonacci);
        fibonacci.printFibo();

        System.out.println("============= query 16.3 =============");
        Fibonacci3 fibonacci3= new Fibonacci3();
        System.out.println(fibonacci3);
        fibonacci3.printFibo();

        System.out.println("============= query 17 =============");
        char[] arr = {'a','b','c','a','b','d','r','c'};
        printArray(arr);
        System.out.println("How many ‘a’ char inside the array?");
        System.out.println(howMany(arr,'a'));
        System.out.println("How many ‘a’ or ‘c’ chars inside the array?");
        System.out.println(""+howManyChars(arr,'a','c'));

        System.out.println("============= query 18 =============");
        String name = "John Bryce";
        System.out.println(name);
        char[] nameArray = convertToCharArray(name);
        System.out.println("after convert string name variable to char[] variable");
        printArray(nameArray);
        System.out.println("How many ‘h’ letters inside the string?");
        System.out.println(howMany(nameArray,'h'));


        System.out.println("============= query 19 =============");
        String str = "Sara Shara Shir Cameach";
        System.out.println(str);
        char[] strArray = convertToCharArray(str);
        printArray(strArray);
        System.out.println("How many Vowels (A,E,I,O,U) letters inside the string?");
        int howManyVowels = howManyChars(strArray,'a','A') + howManyChars(strArray,'e','E')+howManyChars(strArray,'i','I')+howManyChars(strArray,'o','O')+howManyChars(strArray,'u','U');
        System.out.println(howManyVowels);

       

    }
}
