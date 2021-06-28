package design.pattern.template_method;

public class ApplicationMain {

    /**
     *  Template Method Pattern Example
     *
     *  모터가 있고 Template Method를 통해 코드 중복 최소화로 모터를 다양하게 만드는 예제
     */
    public static void main(String[] args) {
        Motor hyundai = new HyunDaiMotor();
        Motor lg = new LGMotor();

        hyundai.move();
        lg.move();
    }
}
