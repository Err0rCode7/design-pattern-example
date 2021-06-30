package design.pattern.mediator;

public class ApplicationMain {

    /**
     *
     * Mediator Pattern Example
     *
     * 중재자를 통해 TCP 통신을 하는 예제
     */
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        ISource tcp = new TcpComm();
        tcp.setMediator(mediator);
        ISource system = new SystemSignal();
        system.setMediator(mediator);

        mediator.addDestination(new Display());
        mediator.addDestination(new Display());
        tcp.eventOccured("connected");
        tcp.eventOccured("disconnected");

        system.eventOccured("key input");
        system.eventOccured("mouse input");
    }
}
