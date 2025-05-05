

package employeesalarysystemusinginheritance.employee;

import java.util.Scanner;



public class Employee {
    
    private String name;
    private String age;

    public Employee() {
    }

    public Employee(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
   public double calculateSalary(){
    
    return 0;
    }
   public void displaySalary(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Employee's name : ");
        name=s.nextLine();
        System.out.println(" Name : "+name+" \n "+" Salary : "+calculateSalary());
    }
    
    
}
