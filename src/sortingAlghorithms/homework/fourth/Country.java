package sortingAlghorithms.homework.fourth;

public class Country
{
    private String countryName;
    private String capital;
    private int numberOfCities;

    public Country(){}
    public Country(String countryName, String capital, int numberOfCities) {
        this.countryName = countryName;
        this.capital = capital;
        this.numberOfCities = numberOfCities;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getNumberOfCities() {
        return numberOfCities;
    }

    public void setNumberOfCities(int numberOfCities) {
        this.numberOfCities = numberOfCities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + countryName + '\'' +
                ", capital='" + capital + '\'' +
                ", numberOfCities=" + numberOfCities +
                '}';
    }
}
