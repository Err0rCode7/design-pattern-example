package design.pattern.mediator;

public interface ISource {
    public void setMediator(Mediator mediator);
    public void eventOccured(String event);
}
