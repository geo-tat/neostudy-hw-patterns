package singleton;

public class Main {
    public static void main(String[] args) {
        CraftLogger logger = CraftLogger.getInstance();
        CraftLogger logger1 = CraftLogger.getInstance();
        Integer in = 0;
        logger.classLogg(in, "numbers");
        System.out.println(logger1.equals(logger));
    }
}
