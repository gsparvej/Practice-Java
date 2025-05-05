
package employeesalarysystemusinginheritance.employee;

import java.util.Scanner;


public class ContractEmployee extends Employee {
    
    private int workingHour;
    private int hourlyRate;

    public ContractEmployee() {
    }

    public ContractEmployee(int workingHour, int hourlyRate) {
        this.workingHour = workingHour;
        this.hourlyRate = hourlyRate;
    }

    public ContractEmployee(int workingHour, int hourlyRate, String name, String age) {
        super(name, age);
        this.workingHour = workingHour;
        this.hourlyRate = hourlyRate;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void displaySalary() {
        
        System.out.println("Enter  Contractual Employees Authentication : ");
        super.displaySalary(); 
    }

    @Override
    public double calculateSalary() {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter EMployee's Working Hour : ");
        workingHour=s.nextInt();
        System.out.print("Enter Hourly Rate : ");
        hourlyRate=s.nextInt();
        return workingHour*hourlyRate; 
    }
    
    
}
