package BuilderPattern.observance;

// so here we make our user class more readable reduce line of code using chaining
public class User{
    private final String name;
    private final int id;
    private  int age;//optional
    private  String phoneNumber;//optional

    public User(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
    }

    public static  class  Builder{
       private final int id;
       private final String name;
       private int age;
       private String phoneNumber;

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder age(int age)  {
            if(age<0){
               throw new IllegalArgumentException("Age can't be negative");
            }
            this.age = age;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }



}
