package proxy;

public class Proxy implements Connection {

    private final ArmStation armStation;
    private final String url = "localhost:port/";

    public Proxy(String name) {
        this.armStation = new ArmStation(name);
    }

    @Override
    public void connect() {
        armStation.connect();
        System.out.println(url + armStation.databaseName());

    }
}
