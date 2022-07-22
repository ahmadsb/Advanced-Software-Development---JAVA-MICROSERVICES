package lab03;

public class Factorial {
    private int num ;
    private int MAX_NUM = 7;
    private int MIN_NUM = 1;
    Factorial(){
        this.num = (int)(Math.random()*(MAX_NUM-MIN_NUM)+MIN_NUM);
    }
    int getNum(){
        return this.num;
    }

    @Override
    public String toString(){
        return "The number is: "+ this.getNum();
    }
    public void factorialNum(){
        System.out.println(this.factorialNumUsingIncForLoop());
       System.out.println(this.factorialNumUsingDecForLoop());
       System.out.println(this.factorialNumUsingIncWhileLoop());
       System.out.println(this.factorialNumUsingDecWhileLoop());
    }
    private int factorialNumUsingIncForLoop(){
        System.out.println("====== factorialnum Num using Inc. for loop ==========");
        int res =1;
        for(int i  = 2 ; i <= this.getNum(); ++i){
               res *=i;
        }
         
        return res;
    }
    private int factorialNumUsingDecForLoop(){
        System.out.println("====== factorialnum Num using Dec. for loop ==========");

        int res =1;
        for(int i  = this.getNum() ; i>=2; --i){
               res *=i;
        }
         
        return res;
    }

    private int factorialNumUsingIncWhileLoop(){
        System.out.println("====== factorialnum Num using Inc. while loop ==========");
        int res =1;
        int i  = 2;
        while(i <= this.getNum()){
            res *=i;
            ++i;
        }
       
         
        return res;
    }
    private int factorialNumUsingDecWhileLoop(){
        System.out.println("====== factorialnum Num using Dec. while loop ==========");

        int res =1;
        int i  = this.getNum();
        while(i>=2){
            res *=i;
            --i;
        }
  
        return res;
    }


    
    
}
