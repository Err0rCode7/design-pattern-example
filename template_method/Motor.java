package design.pattern.template_method;

public abstract class Motor {

    // Template Method
    public void move() {
        System.out.println("Template Method: move()");
        hook();
        moveMotor();
    }

    // Abstract Method
    public abstract void moveMotor();

    // Hook Method
    public abstract void hook();
}
