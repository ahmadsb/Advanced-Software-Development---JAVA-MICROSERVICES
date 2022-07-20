package lab01;
//query 1 and 2
public class Printer {
    private String part1;
    private int visitors;
    private String part2;
    Printer(){
        this.part1 = "There will be";
        this.visitors= 5;
        this.part2 = "people for dinner.";
    }

    @Override
    public String toString(){
        return this.part1 +" " +this.visitors+ " " +this.part2;
    }

    int getVisitors(){
        return this.visitors;
    }
    void setvisitiors(int newValue){
        this.visitors = newValue;
    }

    int incrementVistor(int newValue){
        this.setvisitiors(this.getVisitors() + newValue);
        return this.getVisitors();
    }
}
