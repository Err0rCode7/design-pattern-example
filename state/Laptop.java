package design.pattern.state;

public class Laptop {
    private PowerState powerState;

    public Laptop() {
        this.powerState = Off.getInstance();
    }

    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }

    public void powerPush() {
        powerState.powerPush(this);
    }
}
