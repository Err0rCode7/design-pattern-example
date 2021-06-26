package design.pattern.prototype_pattern;

public class Car implements Cloneable{

    String wheel;
    String frame;

    public Car(String wheel, String frame) {
        this.wheel = wheel;
        this.frame = frame;
    }

    // Cloneable 인터페이스를 사용하고 복사를 오버라이딩하여 사용하면 프로토타입 패턴이다.
    @Override
    public Car clone() {
        Car car = null;
        try {
            car = (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return car;
    }
}
