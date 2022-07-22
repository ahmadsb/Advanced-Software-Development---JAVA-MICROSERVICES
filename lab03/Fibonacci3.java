package lab03;

public class Fibonacci3 {
    private int index;
    private int MAX_INT = 10;
    private int MIN_INT = 50;
    Fibonacci3(){    
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
        if(this.getIndex() < 1){
            return;
        }
            System.out.print(a+", ");
        if(this.getIndex() < 2 ){
                return;
        }
        
        System.out.print(b+", ");

        int i = 3 ;
        for(; i < this.getIndex();++i){
            c = a+b;
            a = b;
            b = c;
            System.out.print(c+", ");
        }
        System.out.println(a+b);
      

    }
}
