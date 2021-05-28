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
public class FullTimeEmployee extends Employee{
    private double basicSalary;
    private double bonus;
    public FullTimeEmployee(int ID,String firstName,String lastName,double basicSalary,double bonus){
        super(ID,firstName,lastName);
        this.basicSalary=basicSalary;
        this.bonus = bonus;
    }
    public double computeSalary(){
        return basicSalary+bonus;
    }
    public String toString(){
        return super.toString()+"salary ("+this.computeSalary()+")";
         
    }
    
}
