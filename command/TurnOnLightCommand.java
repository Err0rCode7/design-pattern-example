package design.pattern.command;

public class TurnOnLightCommand implements Command {

    private Light theLight;

    public TurnOnLightCommand(Light theLight) {
        this.theLight = theLight;
    }

    @Override
    public void execute() {
        theLight.turnOn();
    }
}
