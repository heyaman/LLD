package SOLID.liskovSubsition.voilation;

public class Volunteer implements Employee{
    @Override
    public float calculateSalary() {
        throw new RuntimeException("Volunteer can't draw salary!!");
    }
}
