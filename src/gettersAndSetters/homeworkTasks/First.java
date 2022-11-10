package gettersAndSetters.homeworkTasks;

public class First
{
    public static void main(String[] args) {
        Footballer footballer1 = new Footballer("Lionel", "Messi", "striker", 26, 44);
        Footballer footballer2 = new Footballer("Cristiano", "Ronaldo", "striker", 23, 17);
        Footballer footballer3 = new Footballer("Alarcon", "Isco", "midllefielder", 17, 8);
        Footballer footballer4 = new Footballer("Sergio", "Ramos", "defender", 18, 2);
        Footballer footballer5 = new Footballer("Sergio", "Busquets", "middlefielder", 28, 0);
        Footballer[] arr = {footballer1, footballer2, footballer3, footballer4, footballer5};
        mostGames(arr);
    }

    public static void mostGames(Footballer[] arr)
    {
        Footballer footballer = arr[0];
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i].getGamesCount()>footballer.getGamesCount())
            {
                footballer = arr[i];
            }
        }
        System.out.println(footballer.toString());
    }
}


