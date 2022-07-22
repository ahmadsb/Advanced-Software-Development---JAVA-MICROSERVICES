package lab02;

public class Query2 {
    private int num;
    Query2(){
        this.num = (int)(Math.random() * 101);
    }

    int getNum(){
        return this.num;
    }
    @Override
    public String toString(){
        return "the number is: "+this.getNum();
    }

    public boolean isEven(){
        if(this.getNum() % 2 == 0 )
            return true;
        return false;
    }
    public boolean isBiggerFrom50(){
        if(this.getNum() <= 50 )
            return false;
        return true;
    }
}

