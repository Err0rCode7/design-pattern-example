package design.pattern.facade;

// Facade Pattern Object
public class Computer {

    public static final Long BOOT_ADDRESS = 0L;
    public static final Long BOOT_SECTOR = 0L;
    public Integer SECTOR_SIZE = 0;

    public void bootComputer() {
        Cpu cpu = new Cpu();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}
