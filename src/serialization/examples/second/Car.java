package serialization.examples.second;

import java.io.Serializable;

public class Car implements Serializable
{
    private String engineName;
    private double engineVolume;
    private int year;

    public Car(){}
    public Car(String engineName, double engineVolume, int year) {
        this.engineName = engineName;
        this.engineVolume = engineVolume;
        this.year = year;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineName='" + engineName + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                ", year=" + year +
                '}';
    }
}
