package BuilderPattern.voilation;

// So here we can use setter but we loose mutability here thread safety is missing
public class User3 {
    private final String name;
    private final int id;
    private  int age;//optional
    private  String phoneNumber;//optional

    public User3(String name, int id) {
        this.name = name;
        this.id = id;
        this.age = 0;
        this.phoneNumber = "";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
