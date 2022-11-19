package abstractClasses.homeworkTasks.first;

public class Laptop extends Computer
{
    private int screenFrequency;
    private int touchpadId;

    public Laptop(){}
    public Laptop(String cpuName, int ramVolume, int romVolume, int screenFrequency, int touchpadId) {
        super(cpuName, ramVolume, romVolume);
        this.screenFrequency = screenFrequency;
        this.touchpadId = touchpadId;
    }

    public int getScreenFrequency() {
        return screenFrequency;
    }

    public void setScreenFrequency(int screenFrequency) {
        this.screenFrequency = screenFrequency;
    }

    public int getTouchpadId() {
        return touchpadId;
    }

    public void setTouchpadId(int touchpadId) {
        this.touchpadId = touchpadId;
    }

    public void turnOn()
    {
        System.out.println("Laptop was turned on");
    }

    public void turnOff()
    {
        System.out.println("Laptop was turned off");
    }

    public static Computer maxFrequency(Computer[] arr)
    {
        Computer computer =  arr[0];
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i] instanceof Laptop)
            {
                if(((Laptop) computer).screenFrequency <((Laptop) arr[i]).screenFrequency)
                {
                    computer  = arr[i];
                }
            }
        }
        return computer;
    }

    @Override
    public String toString()
    {
        return getCpuName() + " " + getRamVolume() + " " + getRomVolume() + " " + screenFrequency + " " + touchpadId;
    }
}














