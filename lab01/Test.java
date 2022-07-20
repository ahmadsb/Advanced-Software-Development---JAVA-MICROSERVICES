package lab01;
// qurey 2 
public class Test {
    private int num1;
    private int num2;
    Test(){
        this.num1 = (int)(Math.random()*101);
        this.num2 = (int)(Math.random()*101);
    }

    @Override
    public String toString(){
        return "num1 = "+this.getNum1()+", num2 = "+this.getNum2();
    }

    int getNum1(){
        return this.num1;
    }
    int getNum2(){
        return this.num2;
    }

    public int sum(){
        return this.num1+this.num2;
    }
    public double avg(){
        return this.num1+this.num2 / 2;
    }
  
    public int areaRectangle(){
        return this.num1*this.num2;
    }
    public int remainderFirstNumDividedBy10(){
        return this.num1%10;
    }
    public int remainderSecNumDividedBy10(){
        return this.num1%10;
    }
    
}



