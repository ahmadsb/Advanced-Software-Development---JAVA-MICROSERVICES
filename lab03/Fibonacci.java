package lab03;

public class Fibonacci {
    private int index;
    private int MAX_INT = 40;
    private int MIN_INT = 1;
    Fibonacci(){    
        this.index = (int)(Math.random() * (MAX_INT - MIN_INT) + MIN_INT);

    }

    int getIndex(){
        return this.index;
    }
    @Override
    public String toString(){
        return "The index number is: "+this.getIndex();
    }

    public void printFibo(){
        int a = 1;
        int b = 1;
        int c  =0;
        if(this.getIndex() <=2)
            System.out.println(a);

        for(int i = 3 ; i < this.getIndex();++i){
            c = a+b;
            a = b;
            b = c;
           
        }
        System.out.println(a+b);

    }
}
