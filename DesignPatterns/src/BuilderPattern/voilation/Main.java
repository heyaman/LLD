package BuilderPattern.voilation;
// here problem arise when my class hv too many argument some of them were mandatory and some of them were optional
public class Main {
    public static void main(String[] args) {
        User1 user1=new User1("sam curran",1,23,"602-22344400");// so here for use1 we are forced to pass about these arguments
        User2 user2=new User2("aman",2);// let say here we might introduce other properties as well like age they we further need to n number of constructor
    }
}
