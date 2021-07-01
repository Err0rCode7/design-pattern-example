package design.pattern.state;

public class Saving implements PowerState {

    private Saving() {
    }
    @Override
    public void powerPush(Laptop laptop) {
        System.out.println("전원 on");
        laptop.setPowerState(On.getInstance());
    }

    public static Saving getInstance() {
        return Instance.saving;
    }

    /**
     * thread safety singleton
     */
    private static class Instance {
        static Saving saving = new Saving();
    }
}