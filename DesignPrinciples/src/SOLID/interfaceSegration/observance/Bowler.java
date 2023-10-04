package SOLID.interfaceSegration.observance;

public class Bowler implements Bowling, Fielding{
    @Override
    public void Bowling() {
        System.out.println("doing bowling");
    }

    @Override
    public void field() {
        System.out.println("doing fielding");
    }
}
