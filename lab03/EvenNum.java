package lab03;

public class EvenNum {
    private int num;
    EvenNum(){
        this.num = (int)(Math.random() * 101);
    }


    int getNum(){
        return this.num;
    }
    @Override
    public String toString(){
        return "The random number is: "+this.getNum();
    }
    private Boolean isEven(int val){
        if(val%2 == 0)
            return true;
        return false;
    }
    void printEvens(){
        int i =0;
        int len = this.getNum();
        if(!this.isEven(this.getNum())){
            len --;
        }
        for( ; i <len; i+=2){
            System.out.print(i+", ");
        }
        System.out.println(len);
    }
    
}
