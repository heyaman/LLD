package BuilderPattern.voilation;

public class User1 {
    private final String name;
    private final int id;
    private final int age;//optional
    private final String phoneNumber;//optional

    public User1(String name, int id, int age, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}
