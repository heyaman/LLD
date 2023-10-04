package SOLID.interfaceSegration.observance;

public class AllRounder implements Bowling,Batting,Fielding{
    @Override
    public void bat() {
        System.out.println("doing batting");
    }

    @Override
    public void Bowling() {
        System.out.println("doing bowling");
    }

    @Override
    public void field() {
        System.out.println("doing fielding");

    }
}
