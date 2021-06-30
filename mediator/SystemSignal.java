package design.pattern.mediator;

public class SystemSignal implements ISource {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void eventOccured(String event) {
        mediator.onEvent("System", event);
    }
}
