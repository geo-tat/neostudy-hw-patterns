package singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CraftLogger {
    private static CraftLogger instance;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");

    private CraftLogger() {
    }

    public static synchronized CraftLogger getInstance() {
        if (instance == null) {
            instance = new CraftLogger();
        }
        return instance;
    }

    public void classLogg(Object obj, String info) {
        String currentTime = LocalDate.now().format(formatter);
        String className = obj.getClass().getName();
        System.out.println("Log info: " + currentTime + " - " + className + " - " + info);
    }
}
