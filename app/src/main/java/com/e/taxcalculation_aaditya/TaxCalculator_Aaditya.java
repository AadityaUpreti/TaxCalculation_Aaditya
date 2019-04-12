package com.e.taxcalculation_aaditya;

public class TaxCalculator_Aaditya {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double yearly(){
        return this.salary*12;
    }

    public double calculateTax(){
        if(this.salary*12 <= 200000 ){
            return this.yearly()/100;
            //return this.salary*12/100;
        }
        else if (this.salary*12 > 200000 && this.salary*12 <= 350000 ){
            return ((this.yearly() - 200000)*15/100) + 200000/100;
        }
        else{
            return ( 150000*15/100 + 200000/100) + ( (yearly()- 350000)* 25 / 100 );
        }
    }
}
