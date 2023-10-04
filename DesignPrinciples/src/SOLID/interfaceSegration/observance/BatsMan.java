package SOLID.interfaceSegration.observance;

public class BatsMan implements Batting,Fielding{
    @Override
    public void bat() {
        System.out.println("doing batting");

    }

    @Override
    public void field() {
        System.out.println("doing fielding");

    }
}
