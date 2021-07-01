package design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class Car implements CarElement{

    CarElement[] carElements;

    @Override
    public void accept(CarElementVisitor visitor) {
        for (CarElement carElement : carElements) {
            carElement.accept(visitor);
        }
        visitor.visit(this);
    }

    public CarElement[] getCarElements() {
        return carElements.clone();
    }

    public Car() {
        this.carElements = new CarElement[]
                {
                    new Wheel("front left"), new Wheel("front right"),
                    new Wheel("rear left"), new Wheel("rear right"),
                    new Body(), new Engine()
                };
    }
}
