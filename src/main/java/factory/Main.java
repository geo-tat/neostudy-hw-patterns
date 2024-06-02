package factory;

public class Main {
    public static void main(String[] args) {
        Coffee americano = CoffeeFactory.makeCoffee(CoffeeType.AMERICANO);
        americano.start();

        Coffee espresso = CoffeeFactory.makeCoffee(CoffeeType.ESPRESSO);
        espresso.start();

    }
}
