package SOLID.singleResponsibility.voilaition;
//SRP
/*
* so here we have multiple reason to change single class by  different role like HR, engineering manager
* eg1: let say we just returning peformance report in json ,next day we need in CSV format we again need to change the class
* eg2: let say as of now employee choose old tax regime thn govt introduce new tax regime thn we calculate salry on new policy
* */

public class Employee {
    private int id;

    public int getId() {
        return id;
    }

    public Employee(int id) {
        this.id = id;
    }

    // retrive perfromance report
    public String getEmployeePerformanceReport(Employee employee) {
        //based upon certain criteria we can generate report
        return "";
    }

    /*
     * based upon certain criteria we calculate salary
     * whether its intern ,fulltime,its stock annual bonus performance bonus
     *  */
    public float calculateSalary(Employee employee) {

        return 0;

    }
}
