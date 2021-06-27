package design.pattern.facade;

public class HardDrive {
    public byte[] read(long start, int size) {
		// HardDrive read data
        System.out.println("HardDrive read data start: " + start + " size: " + size);
        byte[] bytes = new byte[]{Byte.parseByte("123"), Byte.parseByte("123")};
        return bytes;
    }
}
