package lab03;

public class Fibo {
    private int num;
    Fibo(){
        this.num = 40;
    }
    public int getNum(){
        return this.num;
    }

    @Override
    public String toString(){
        return "The number is: "+this.getNum();
    }

   
    public void printFibo(){
        int a = 1;
        int b = 1;
        int c  =0;
        System.out.print(a+", ");
        System.out.print(b+", ");
        int i = 3 ;
        for(; i < this.getNum();++i){
            c = a+b;
            a = b;
            b = c;
            System.out.print(c+", ");
        }
        System.out.println(a+b);
        

    }
}
