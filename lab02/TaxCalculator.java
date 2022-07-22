package lab02;

public class TaxCalculator {
    private double salary;
    private double tax;

    TaxCalculator(){
        this.salary = (int)(Math.random() * 200000);
        if(salary >= 0 && salary <= 23000){
            tax = 10.0;
        }else if(salary >= 23001 && salary <= 50000){
            tax = 20.0;
        }else if(salary >= 50001 && salary <= 100000){
            tax = 30.0;
        }else if(salary >=10001){
            tax = 40.0;
        }
    }
    @Override
    public String toString(){
        return "The salary is "+this.getSalary()+",\nand the tax is "+this.getTax()+"%";
    }
    double getSalary(){
        return this.salary;
    }
    double getTax(){
        return this.tax;
    }

    double salaryAfterTax(){
        return this.getSalary() * (100 - this.getTax())/100;
    }
}
