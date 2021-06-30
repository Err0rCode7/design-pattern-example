package design.pattern.mediator;

public interface IDestination {
    public void receiveEvent(String from, String event);
}
