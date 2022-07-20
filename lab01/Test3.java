package lab01;
//query 5
public class Test3 {
    private int num1;
    private int num2;

    Test3(){
        this.num1 = (int) (Math.random() *101);
        this.num2 = (int) (Math.random() *101);
    }

    @Override
    public String toString(){
        return "num1 = "+this.getNum1() + ", num2 = "+this.getNum2();
    }

    int getNum1(){
        return this.num1;
    }
    int getNum2(){
        return this.num2;
    }
    public int getMax(){
        return this.num1 > this.num2? this.num1:this.num2;
    }
    
}
