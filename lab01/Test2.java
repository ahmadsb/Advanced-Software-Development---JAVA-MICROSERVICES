package lab01;
//query 5
public class Test2 {
    private int minutes;
  

    Test2(){
        this.minutes = (int) ((Math.random() *(350 - 100) + 100));
    }

    @Override
    public String toString(){
        return "minutes = "+this.minutes;
    }

    public int getMintues(){
        return this.minutes;
    }
    public String printTime(){
        int hours = this.getHours();
        int min = this.getMintues() %60;
        return "Time: "+hours+":"+min;
    }

    private int getHours(){
        return this.minutes/60;
    }
  
    
}
