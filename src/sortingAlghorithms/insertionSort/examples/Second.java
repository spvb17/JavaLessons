package sortingAlghorithms.insertionSort.examples;

import java.util.Arrays;

//У нас есть класс Movie
//String name, String genre, int actorsAmount, int budget
public class Second
{
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "triller", 24, 100000);
        Movie movie2 = new Movie("Taxi", "comedy", 50, 25000000);
        Movie movie3 = new Movie("Interstellar", "fantasy", 32, 155000);
        Movie[] arr = {movie1, movie2, movie3};
//        insertSort(arr);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(Movie[] arr)
    {
        int size = arr.length;
        for(int i=1; i<size; ++i)
        {
            Movie key = arr[i];
            int j = i - 1;
            while (j >= 0 && key.getActorsAmount() < arr[j].getActorsAmount())
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void bubbleSort(Movie[] arr)
    {
        int n = arr.length;
        for(int i=0; i<n-1; ++i)
        {
            for(int j=0; j<n-1-i; ++j)
            {
                if(arr[j].getBudget() > arr[j+1].getBudget())
                {
                    Movie temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class Movie
{
    private String movieName;
    private String movieGenre;
    private int actorsAmount;
    private int budget;

    public Movie(){}
    public Movie(String movieName, String movieGenre, int actorsAmount, int budget) {
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.actorsAmount = actorsAmount;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getActorsAmount() {
        return actorsAmount;
    }

    public void setActorsAmount(int actorsAmount) {
        this.actorsAmount = actorsAmount;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieGenre='" + movieGenre + '\'' +
                ", actorsAmount=" + actorsAmount +
                ", budget=" + budget +
                '}';
    }
}