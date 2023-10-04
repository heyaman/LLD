package SOLID.OpenClosed.voilation;
import java.util.*;

public class Attack {
    public void attachWithSuperHeroes(List<SuperHeroes>list){
       for (SuperHeroes hero: list){
           switch (hero){
               case BAT_MAN :
                   System.out.println(hero.attackWithBatMan());
                   break;
               case CAPTAIN_AMERICA:
                   System.out.println(hero.attackWithCaptainAmerica());
                   break;
               case SPIDER_MAN:
                   System.out.println(hero.attackWithSpiderMan());
                   break;
               default:
                   System.out.println("OOPS ! this hero not found in our system");
           }
       }

    }
}
