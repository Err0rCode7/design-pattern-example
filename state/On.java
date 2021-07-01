package design.pattern.state;

public class On implements PowerState {

    private On() {
    }

    @Override
    public void powerPush(Laptop laptop) {
        System.out.println("전원 off");
        laptop.setPowerState(Off.getInstance());
    }

    public static On getInstance() {
        return Instance.on;
    }

    /**
     * thread safety singleton
     */
    private static class Instance {
        static On on = new On();
    }
}
