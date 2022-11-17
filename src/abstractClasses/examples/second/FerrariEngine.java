package abstractClasses.examples.second;

public class FerrariEngine extends Engine
{

    public FerrariEngine(){};
    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight)
    {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    @Override
    public double efficiency() {
        return 0.25;
    }

    @Override
    public double throttleEnergy() {
        return getEngineVolume()*getEngineVolume()*100;
    }

    @Override
    public double breakEnergy() {
        return getEngineWeight()*2;
    }
}
