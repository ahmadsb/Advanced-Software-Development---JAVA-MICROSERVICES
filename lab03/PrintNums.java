package lab03;

public class PrintNums {
    private int num ;
    PrintNums(){
        this.num = (int)(Math.random() *  101) ;

    }
    int getNum(){
        return this.num;
    }
    @Override
    public String toString(){
        return "The random number is: "+this.getNum();
    }
    public void printAllNums(){
        int i = 1;
        for(; i <this.getNum() ; ++i){
            System.out.print(i+", ");
        }
        System.out.println(i);
    }
}
