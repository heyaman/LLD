package BuilderPattern.observance;
/*
* Builder pattern:
* here we use this when we have too many of the argument are given we also want to make immutability or thread safety*/
public class Main {
    public static void main(String[] args) {
       User user=new User.Builder(1, "virat").age(-24).phoneNumber("101-3344444444").build();
//       User user1=new User.Builder(2);
    }
}
