/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;

/**
 *
 * @author Arwa
 */
public class PartTimeEmployee extends Employee {
    private double payRate;
    private double workedHourse;
    public PartTimeEmployee(int ID,String firstName,String lastName,double payRate,double workedHourse){
        super(ID,firstName,lastName);
        this.payRate=payRate;
        this.workedHourse=workedHourse;
    }
    public double computeSalary(){
        if(workedHourse<=40){
            return workedHourse*payRate;
        }
        else{
            double extra = workedHourse-40;
            double initial = 40*payRate;
            double two= extra*(150 *payRate);
            return initial+two;
        }
    }
    public String toString(){
        return super.toString()+"workedHours ("+workedHourse+") ,"+"pay rate ("+payRate+") salary ("+this.computeSalary()+")";
    }
         
          
}
