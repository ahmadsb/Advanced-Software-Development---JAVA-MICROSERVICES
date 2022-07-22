package lab03;

public class Among {
    private int num1;
    private int num2;
    Among(){
        this.num1 = (int)(Math.random()*101);
        this.num2 = (int)(Math.random()*101);
    }

    int getNum1(){
        return this.num1;
    }
    int getNum2(){
        return this.num2;
    }
    @Override
    public String toString(){
        return "The number 1 is: "+this.getNum1()+", The number 2 is: "+this.getNum2();
    }
    void printAomngBetweenThem(){
        int min = this.getNum1() > this.getNum2() ? this.getNum2() : this.getNum1();
        int max = this.getNum1() < this.getNum2() ? this.getNum2() : this.getNum1();
        if(this.getNum1() == this.getNum2()){
            System.out.println("the 2 numbers are same");
            return ;
        }
        int i = min+1;
        for(; i < max-1; ++i){
            System.out.print(i+", ");
        }
        System.out.println(i);
    }
}
