package SOLID.liskovSubsition.voilation;
import java.util.*;
/*
* So here liskov subsituation principle says
* 1) Never ever inherit anything just for the sake of reusabbility
* 2) Object of parent class should be replacble with it subclasses object means subclass always have is-a relation with its parent we dont require external handling
* like we were seeing volunteer is not an employee check code for more understanding*/


public class SalaryDisburser {
    protected void disbursedSalary(List<Employee>employeesList){
        for (Employee employee:employeesList){
            if(employee instanceof Volunteer){
                continue;
            }else {
                employee.calculateSalary();
            }


        }
    }
}
