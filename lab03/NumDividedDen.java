package lab03;

public class NumDividedDen {
    private int max;
    private int den;
    NumDividedDen(){
        this.max = (int)(Math.random()*101);
        this.den = (int)(Math.random()*101);
    }

    int getMax(){
        return this.max;
    }
    int getDen(){
        return this.den;
    }
    @Override
    public String toString(){
        return "The max number is: "+this.getMax()+", The den number is: "+this.getDen();
    }

    private boolean isDevidedByDen(int num){
        if(num == 0 )
            return false;
        return num%this.getDen()== 0 ? true:false;
    }
    void printNumsToMaxDividedByDen(){
        
        if(this.getMax() < this.getDen()){
            System.out.println("The max number is smaller than den number");
            return ;
        }
        if(this.getDen() == 0){
            System.out.println(0);
            return;
        }
        int i =0;
        int len = this.getMax();
        int remainder = this.getMax() % this.getDen();
        if(remainder != 0){
            len = this.getMax() - remainder;
        }
        for(; i < len ; i+= this.getDen()){
            if(this.isDevidedByDen(i))
                System.out.print(i+", ");
        }
        System.out.println(i);
      
    }
}
