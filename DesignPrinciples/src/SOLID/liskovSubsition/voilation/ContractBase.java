package SOLID.liskovSubsition.voilation;

public class ContractBase implements Employee{
    @Override
    public float calculateSalary() {
        return 0;
    }
}
