package BuilderPattern.voilation;

// here there is one hack we can use constructor overloading
public class User2 {
    private final String name;
    private final int id;
    private final int age;//optional
    private final String phoneNumber;//optional

    public User2(String name, int id, int age, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    public User2(String name, int id) {
        this.name = name;
        this.id = id;
        this.age = 0;
        this.phoneNumber = "";
    }

}
