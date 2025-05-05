
package employeesalarysystemusinginheritance;

import employeesalarysystemusinginheritance.employee.ContractEmployee;
import employeesalarysystemusinginheritance.employee.Employee;
import employeesalarysystemusinginheritance.employee.PermanentEmployee;


public class EmployeeSalarySystemUsingInheritance {

    
    public static void main(String[] args) {
        
        Employee e =new Employee();
        PermanentEmployee pe=new PermanentEmployee();
        ContractEmployee ce=new ContractEmployee();
        
        
        pe.displaySalary();
        
        ce.displaySalary();
        
    }
    
}
