package SOLID.dependecyInversion.observance;

import java.util.Scanner;

public class UPI implements PaymentProcessor{
    @Override
    public void payment() {
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter UPI pin: ");
        String str=in.next();
        if(str.length()==6){
            System.out.println("payment done");
        }else{
            System.out.println("payment failed");
        }

    }
}
