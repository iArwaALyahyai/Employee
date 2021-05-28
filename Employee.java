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
public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    public Employee(int ID,String firstName,String lastName){
        this.ID=ID;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    
    public String toString(){
        return lastName+","+firstName+"("+ID+")";
    }
}
