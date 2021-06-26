package design.pattern.bridge_pattern;

public abstract class Switch {

    protected Appliance appliance;

    public Switch(Appliance appliance) {
        this.appliance = appliance;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
