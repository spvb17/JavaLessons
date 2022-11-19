package enums.examples.second;

public enum Year
{
    WINTER(-10),
    SPRING(10),
    SUMMER(25)
            {
                @Override
                public String getDescription()
                {
                    return "Теплое время года";
                }
            },
    FALL(15);

    private int avgTemperature;

    private Year(){}
    private Year(int avgTemperature)
    {
        this.avgTemperature = avgTemperature;
    }

    public int getAvgTemperature()
    {
        return avgTemperature;
    }

    public String getDescription()
    {
        return "Холодное время года";
    }
}