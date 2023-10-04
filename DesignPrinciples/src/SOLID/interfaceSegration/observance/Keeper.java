package SOLID.interfaceSegration.observance;

public class Keeper implements Batting,Keeping{
    @Override
    public void bat() {
        System.out.println("doing batting");
    }

    @Override
    public void keep() {
        System.out.println("doing keeping");
    }
}
