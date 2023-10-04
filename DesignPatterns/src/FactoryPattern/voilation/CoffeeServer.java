package FactoryPattern.voilation;
/*
* So here problem is when we have make object of any Entity which can be of multiple type
* eg: coffee of Cappuccino, Americano, billing of type estimate,invoice
* but here is huge problem like my higher level classes like cofferServer is directly linking with my concrete classes Cappuccino,Americano it directly
* voilate my depdency inversion principle */
public class CoffeeServer {
    public static void main(String[] args) {
        Coffee cappuccino=new Cappuccino("Cappuccino");
        Coffee americano=new Americano("Americano");
        cappuccino.makeCoffee();
    }

}
