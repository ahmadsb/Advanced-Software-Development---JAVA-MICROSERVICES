package lab02;

public class Query1 {
    private int num;
    Query1(){
        this.num = (int)(Math.random() * 101);
    }

    int getNum(){
        return this.num;
    }
    @Override
    public String toString(){
        return "the number is: "+this.getNum();
    }

    public boolean isBiggerFrom50(){
        if(this.getNum() > 50 )
            return true;
        return false;
    }
    public boolean isEqual50(){
        if(this.getNum() == 50 )
            return true;
        return false;
    }

}
