package SOLID.singleResponsibility.observance;
/*
*
* here we segarted all classes seperately like  salary calculator, performance report generator,
* lets say we had to change report gen format we just need to do changes in report generator class rest classes remains unchanged*/
public class Employee {
    private int id;

    public int getId() {
        return id;
    }
}
