package SOLID.OpenClosed.voilation;
import java.util.*;
/*
* Now here this is the voialation of open closed principle
* eg: let say i want to introduce new super hero i.e ANT_MAN in that case i had touch my attack class which is full of switch statemnt had to add one more case
* secondly in this Attack class tightly coupled with superHeroes like wht type of hero is bbased upon that it calling my attack method instead of it
* just have to depend upon abstact class of superheores adnmy concrete class lke Batman and cpataimn america who implementing that interface or abstract class
* */

public class AttackerSimulator {
    public static void main(String[] args) {
        List<SuperHeroes>list=new ArrayList<>();
        list.add(SuperHeroes.CAPTAIN_AMERICA);
        list.add(SuperHeroes.BAT_MAN);
        list.add(SuperHeroes.SPIDER_MAN);
        Attack attack=new Attack();
        attack.attachWithSuperHeroes(list);
    }
}
