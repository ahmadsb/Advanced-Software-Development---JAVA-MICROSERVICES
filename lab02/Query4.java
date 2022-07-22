package lab02;

public class Query4 {
    private int num1;
    private int num2;
    private int num3;
    Query4(){
        this.num1 = (int)(Math.random() * 101);
        this.num2 = (int)(Math.random() * 101);
        this.num3 = (int)(Math.random() * 101);
    }
    public String toString(){
        return "num1= " +this.getNum1() +" num2= "+this.getNum2()+" num3= "+this.getNum3();
    }
    int getNum1(){
        return this.num1;
    }
    int getNum2(){
        return this.num2;
    }
    int getNum3(){
        return this.num3;
    }
    int theBiggerNumIs(){
        int max = this.getNum1() > this.getNum2()? this.getNum1():this.getNum2();
        return max > this.getNum3()? max : this.getNum3();
    }
    
}
