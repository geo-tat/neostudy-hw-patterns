package factory;

public class CoffeeFactory {

    public static Coffee makeCoffee(CoffeeType type) {
        Coffee cofee;
        switch (type) {
            case ESPRESSO -> cofee = new Espresso();
            case AMERICANO -> cofee = new Americano();
            default -> throw new IllegalArgumentException("Нет такого напитка " + type);
        }
        return cofee;
    }
}
