package SOLID.liskovSubsition.voilation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SalaryDisburser salaryDisburser=new SalaryDisburser();
        List<Employee>list=new ArrayList<>();
        list.add(new FullTime());
        list.add(new Intern());
        list.add(new ContractBase());
        list.add(new Volunteer());
        salaryDisburser.disbursedSalary(list);

    }
}
