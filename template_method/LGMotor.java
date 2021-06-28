package design.pattern.template_method;

public class LGMotor extends Motor {

    @Override
    public void moveMotor() {
        System.out.println("Move LGMotor");
    }

    @Override
    public void hook() {
        System.out.println("Hook LGMotor");
    }
}
