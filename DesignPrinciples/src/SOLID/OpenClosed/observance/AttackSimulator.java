package SOLID.OpenClosed.observance;
import java.util.*;
/*
* Here u can see my attack class no more in connection with concreate class like batman,captainamerica or superman
* here let say i need to add one more attacking superhero like AntMan i simply create class and implement superHeor interface with changeing single peiace of code
* into attack class and attacking simulator*/

public class AttackSimulator {
    public static void main(String[] args) {
        List<SuperHeroes>list=new ArrayList<>();
        list.add(new BatMan());
        list.add(new CaptainAmerica());
        Attack attack=new Attack();
        attack.attackWithSuperHeroes(list);

    }
}
