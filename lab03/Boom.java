package lab03;

public class Boom {
    private int num;
    Boom(){
        this.num = (int)(Math.random() * 101);
    }
    public int getNum(){
        return this.num;
    }
    @Override
    public String toString(){
        return "the number is: "+this.getNum();
    }
    private boolean has7(){
        int temp = this.getNum();
        while(temp > 0){
            if(temp%10 == 7)
                return true;
            temp /=10;
        }
        return false;
       }
    private Boolean isBoom(){
        if(this.getNum() % 7 == 0 || this.has7() )
            return true;
        return false;
    }
    public void game(){
        if(isBoom()){
            System.out.println("boom");
            return ;
        }
        System.out.println(this.getNum());
    }
    
}
