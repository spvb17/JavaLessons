package sortingAlghorithms.homework.fourth;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        Country country1 = new Country("Kazakhstan", "Astana", 17);
        Country country2 = new Country("Spain", "Madrid", 29);
        Country country3 = new Country("Russian", "Moscow", 53);
        Country country4 = new Country("Denmark", "Copenhagen", 12);
        Country country5 = new Country("Canada", "Ottawa", 22);
        Country[] countries = {country1, country2, country3, country4, country5};
        sortArray(countries);
        System.out.println(Arrays.toString(countries));
    }

    public static void sortArray(Country[] arr)
    {
        int size = arr.length;
        for(int i=1; i<size; ++i)
        {
            Country key = arr[i];
            int j = i-1;
            while(j>=0 && key.getNumberOfCities()>arr[j].getNumberOfCities())
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
