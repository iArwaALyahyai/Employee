/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;
import java.util.ArrayList;

/**
 *
 * @author Arwa
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee[] employees = new Employee[5];
       employees[0]= new FullTimeEmployee(1652,"Ahmed","AL Omari",1650,35.7);
       employees[1]= new PartTimeEmployee(6723,"Hassan","AL Malki",2.5,45);
       employees[2]= new FullTimeEmployee(8721,"Omar","AL Abri",1869,42);
       employees[3]= new FullTimeEmployee(8201,"Maryam","AL Mawali",967,25);
       employees[4]= new PartTimeEmployee(6723,"Azza","AL Hinai",5,35);
       reverse(employees);
    }
    public static <E> void reverse(E[] list){
       
        for(int i=list.length-1;i>=0;i--){
            System.out.println(list[i].toString());
        }
    }
    
}
