package design.pattern.state;

public class Off implements PowerState {

    private Off() {
    }

    @Override
    public void powerPush(Laptop laptop) {
        System.out.println("절전 모드");
        laptop.setPowerState(Saving.getInstance());
    }

    public static Off getInstance() {
        return Instance.instance;
    }

    /**
     * thread safety singleton
     */
    private static class Instance {
        static Off instance = new Off();
    }
}
