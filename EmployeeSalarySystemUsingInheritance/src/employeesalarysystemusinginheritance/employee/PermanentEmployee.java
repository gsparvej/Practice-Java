

package employeesalarysystemusinginheritance.employee;

import java.util.Scanner;



public class PermanentEmployee extends Employee {
    
    private int baseSalary;
    private int bonus;

    public PermanentEmployee() {
    }

    public PermanentEmployee(int baseSalary, int bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public PermanentEmployee(int baseSalary, int bonus, String name, String age) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
   public double calculateSalary() {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Base Salary ");
        baseSalary=s.nextInt();
        System.out.print("Enter Bonus Amount : ");
        bonus=s.nextInt();
        return baseSalary+bonus; 
        
    }

    @Override
   public void displaySalary() {
        
        System.out.println("Enter  Permanent Employees Authentication : ");
        super.displaySalary(); 
    }
    
    
    
}
