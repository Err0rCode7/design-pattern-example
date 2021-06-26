package design.pattern.bridge_pattern;

public class RemoteController extends Switch{

    public RemoteController(Appliance appliance) {
        super(appliance);
    }

    @Override
    public void turnOn() {
        this.appliance.run();
        System.out.println("RemoteController On: run AirConditioner");
    }

    @Override
    public void turnOff() {
        this.appliance.stop();
        System.out.println("RemoteController Off: AirConditioner stopped");
    }
}
