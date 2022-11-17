package abstractClasses.examples.second;

public abstract class Engine
{
    private double engineVolume;
    private int cylinderAmount;
    private double engineWeight;

    public Engine(){};
    public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }

    public abstract double efficiency();
    public abstract double throttleEnergy();
    public abstract double breakEnergy();

    public double getMaxSpeed()
    {
        return (throttleEnergy()-breakEnergy())*efficiency();
    }
}
