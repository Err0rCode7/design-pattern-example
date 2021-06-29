package design.pattern.command;

public class ApplicationMain {

    /**
     * Command Pattern Example
     *
     * 스위치에게 불을 키고 끄는 커맨드를 넘겨주어 스위치의 동작이 불을 키고 끄도록하게 하는 예제
     */
    public static void main(String[] args) {
        Light light = new Light();
        Command switchUp = new TurnOnLightCommand(light);
        Command switchDown = new TurnOffLightCommand(light);

        Switch s = new Switch(switchUp, switchDown);
        s.flipUp();
        s.flipDown();
    }
}
