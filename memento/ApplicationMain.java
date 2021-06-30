package design.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMain {

    /**
     * Memento Pattern Example
     *
     * Originator 를 통해 Mementor를 관리하고 Caretaker에 의해 저장 및 복원되는 형태
     *
     * main class가 Caretaker가 된다.
     */
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        caretaker.doSomething();
    }

    static class Caretaker {
        List<Originator.Memento> savedStates = new ArrayList<>();

        public void doSomething() {
            Originator originator = new Originator();

            originator.set("State1");
            originator.set("State2");
            savedStates.add(originator.saveToMemento());
            originator.set("State3");

            savedStates.add(originator.saveToMemento());
            originator.set("State4");

            originator.restoreFromMemento(savedStates.get(0));
        }

    }
}
