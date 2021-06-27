package design.pattern.facade;

public class Cpu {
    public void freeze() {
        // Cpu Freeze
        System.out.println("Cpu Freeze");
    }
    public void jump(long position) {
        // Cpu Process jump
        System.out.println("Cpu Process jump to " + position);
    }
    public void execute() {
        // Cpu Process execute
        System.out.println("Cpu Process execute");
    }
}
