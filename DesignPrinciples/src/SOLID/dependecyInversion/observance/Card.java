package SOLID.dependecyInversion.observance;

import java.util.Scanner;

public class Card implements PaymentProcessor{
    @Override
    public void payment() {
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter card number: ");
        String cardNumber=in.next();
        System.out.println("Please enter card cvv: ");
        String cvv=in.next();
        if(cardNumber.length()==10 && cvv.length()==3){
            System.out.println("payment done");
        }else{
            System.out.println("payment failed");
        }
    }
}
