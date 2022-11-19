package abstractClasses.homeworkTasks.first;

public abstract class Computer
{
    private String cpuName;
    private int ramVolume;
    private int romVolume;

    public Computer(){};
    public Computer(String cpuName, int ramVolume, int romVolume) {
        this.cpuName = cpuName;
        this.ramVolume = ramVolume;
        this.romVolume = romVolume;
    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public int getRamVolume() {
        return ramVolume;
    }

    public void setRamVolume(int ramVolume) {
        this.ramVolume = ramVolume;
    }

    public int getRomVolume() {
        return romVolume;
    }

    public void setRomVolume(int romVolume) {
        this.romVolume = romVolume;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
