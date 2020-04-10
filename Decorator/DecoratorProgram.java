package Decorator;

public class DecoratorProgram {

    public static void main(String[] args) {

        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " costs " + beverage1.cost());

        Beverage beverage2 = new Decaf();
        beverage2 = new Cream(beverage2);
        beverage2 = new SteamedMilk(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " costs " + beverage2.cost());

    }
}
