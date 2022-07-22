package lab02;

public class SalaryRaiser {

    private  double salary ;
    private final int MAX_SALARY = 6000;
    private final int MIN_SALARY = 5000;

    SalaryRaiser(){
        this.salary = (int)(Math.random() * (MAX_SALARY-MIN_SALARY)+MIN_SALARY);
    }
    double getSalary(){
        return salary;
    }
    void setSaraly(double newSalary){
        this.salary = newSalary;
    }
    
    @Override
    public String toString(){
        return "the current salary is " + this.salary ;
    }

    double percentRaise(){
       
        if((this.getSalary() * 1.1)<= MAX_SALARY){
           return 0.1;// 10%
        }
       
        return 0.05;//5%
    }
    double raiseSalary(){
        double raise = this.percentRaise();
        double newSalary = this.getSalary()*raise + this.getSalary();
        this.setSaraly(newSalary);
        return this.getSalary();
    }

  
}
