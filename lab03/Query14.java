package lab03;

public class Query14 {
    private int num;
    
    Query14(){
        this.num = (int)(Math.random() * 100_001);
    }

    int getNum(){
        return this.num;
    }
    @Override
    public String toString(){
        return "The random number is: "+this.getNum();
    }   

    private int reverse(){
        int res = 0;
        int temp= this.getNum();
    
        while(temp > 0){
            res*=10;
            res+=temp%10;
            temp /=10;
        }
        return res; 
    }
    

    public Boolean isPalindrome(){
        int reverseNum = this.reverse();
        if(this.getNum() == reverseNum)
            return true;
        return false;
    }
}
