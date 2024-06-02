package adapter;

public class Computer {
    private final USBAdapter adapter;

    public Computer(USBAdapter adapter) {
        this.adapter = adapter;
    }

    public void readByAdapter() {
        System.out.println("Adapter switch ON");
        adapter.readData();
    }
}
