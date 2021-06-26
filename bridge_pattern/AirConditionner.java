package design.pattern.bridge_pattern;

public class AirConditionner implements Appliance{
    @Override
    public void run() {
        System.out.println("Run AirConditioner");
    }

    @Override
    public void stop() {
        System.out.println("Stop AirConditioner");
    }
}
