package SOLID.interfaceSegration.observance;
import java.util.*;
/*
* so here ISP say: Interface segration principle:
* 1) client should never depend on that method which they cant use 
* 2) try thinking with interface segration of behavious wise
* 3) composition should always priortise over inheritance
* */

public class Cricket {
    public static void main(String[] args) {
        List<BatsMan>batsMEN=new ArrayList<>();
        List<AllRounder>allRounders=new ArrayList<>();
        List<Bowler>bowlers=new ArrayList<>();
        List<Keeper>keepers=new ArrayList<>();
        batsMEN.add(new BatsMan());
        batsMEN.add(new BatsMan());
        batsMEN.add(new BatsMan());
        batsMEN.add(new BatsMan());
        bowlers.add(new Bowler());
        bowlers.add(new Bowler());
        bowlers.add(new Bowler());
        bowlers.add(new Bowler());
        allRounders.add(new AllRounder());
        allRounders.add(new AllRounder());
        allRounders.add(new AllRounder());
        allRounders.add(new AllRounder());
        playMatch(batsMEN,bowlers,allRounders,keepers);

    }
    static void playMatch(List<BatsMan>batsMEN,List<Bowler>bowlers,List<AllRounder>allRounders,List<Keeper>keepers){
        for (BatsMan batsMan:batsMEN){
            batsMan.bat();
        }
        for (Keeper keeper:keepers){
            keeper.bat();
        }

        for (AllRounder allRounder:allRounders){
            allRounder.bat();
        }
    }
}
