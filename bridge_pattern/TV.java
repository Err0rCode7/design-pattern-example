package design.pattern.bridge_pattern;

public class TV implements Appliance{

    @Override
    public void run() {
        System.out.println("Run TV");
    }

    @Override
    public void stop() {
        System.out.println("Stop TV");
    }
}
