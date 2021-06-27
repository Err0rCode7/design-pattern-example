package design.pattern.facade;

public class Memory {
    public void load(long position, byte[] data) {
        // 메모리에 데이터를 로드
        System.out.println("Load data to Memory, position: " + position + " data: " + data);
    }
}
