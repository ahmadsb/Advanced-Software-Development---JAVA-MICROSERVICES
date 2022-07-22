package lab02;

public class Year {
    private int year;
    Year(){
        this.year = (int)(Math.random() * 10001);
    }

    @Override
    public String toString(){
        return "The year is "+this.getYear();
    }
    boolean isLeap(){
        int currYear = this.getYear();
        if( currYear%4 == 0  && currYear%100 !=0)
            return true;
        if(currYear%400 == 0)
            return true;
        return false;
    }
    int getYear(){
        return this.year;
    }
    
}
