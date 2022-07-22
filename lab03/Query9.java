package lab03;

public class Query9 {
    private int num;
    Query9(){
        this.num = (int)(Math.random() * 100001);
    }


    int getNum(){
        return this.num;
    }
    @Override
    public String toString(){
        return "The random number is: "+this.getNum();
    }
   public int lengthOfDigits(){
    int counter = 0;
    int temp = this.getNum();
    while(temp > 0){
        counter++;
        temp /=10;
    }
    return counter;
   }
    public int rightDigit(){
            return this.getNum()%10;
    }
    public int leftDigit(){
        int temp = this.getNum();
        int len = this.lengthOfDigits()-1;
    
        while(len > 0){
            temp /=10;
            len --;
        }
       
        return temp%10;
    }
    public int reverse(){
        int res = 0;
        int temp= this.getNum();
     
        while(temp > 0){
            res*=10;
            res+=temp%10;
            temp /=10;
        }
        return res; 
    }
    public int sumDigits(){
        int sum =0;
        int temp = this.getNum();
        while(temp > 0){
            sum+= temp%10;
            temp /=10;
        }
        return sum;
    }
    
}
