package abstractClasses.homeworkTasks.first;

public class Monoblock extends Computer
{
    private String displayType;

    public Monoblock(){}
    public Monoblock(String cpuName, int ramVolume, int romVolume, String displayType)
    {
        super(cpuName, ramVolume, romVolume);
        this.displayType = displayType;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public static void isIps(Computer[] arr)
    {
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i] instanceof Monoblock)
            {
                if(((Monoblock) arr[i]).displayType.equals("IPS"))
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void isMonoblock(Computer[] arr)
    {
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i] instanceof Monoblock)
            {
                System.out.println(arr[i].toString());
            }
        }
    }

    public void turnOn()
    {
        System.out.println("Monoblock was turned on");
    }
    public void turnOff()
    {
        System.out.println("Monoblock was turned off");
    }

    @Override
    public String toString()
    {
        return getCpuName() + " " + getRamVolume() + " " + getRomVolume() + " " + displayType;
    }
}
