package SOLID.OpenClosed.observance;
import java.util.*;

public class Attack {
    public  void attackWithSuperHeroes(List<SuperHeroes>list){
        for (SuperHeroes heroes: list){
            heroes.attack();
        }
    }
}
