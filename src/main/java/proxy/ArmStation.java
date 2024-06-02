package proxy;

public record ArmStation(String databaseName) implements Connection {

    @Override
    public void connect() {
        System.out.println("Connected to database: " + databaseName);
    }

}
