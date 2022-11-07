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
        mostGoals(arr);
        toReserve(arr);

    }

    public static void mostGames(Footballer[] arr)
    {
        Footballer footballer = arr[0];
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i].getGameCount()>footballer.getGameCount())
            {
                footballer = arr[i];
            }
        }
        System.out.println("Footballer with most games is " + footballer.getName() +", he has " + footballer.getGameCount()+" games");
    }

    public static void mostGoals(Footballer[] arr)
    {
        Footballer footballer = arr[0];
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i].getGoalCount()>footballer.getGoalCount())
            {
                footballer = arr[i];
            }

        }
        System.out.println("Footballer with most games is " + footballer.getName() +", he has " + footballer.getGoalCount()+" goals");
    }

    public static void toReserve(Footballer[] arr)
    {
        for(int i=0; i<arr.length; ++i)
        {
            if(arr[i].getGoalCount()<3)
            {
                arr[i].setReserve(true);
            }
            System.out.println(arr[i].toString());
        }
    }
}

class Footballer
{
    private String name;
    private String lastName;
    private String position;
    private int gameCount;
    private int goalCount;
    private boolean reserve = false;

    public Footballer(){};
    public Footballer(String name, String lastName, String position, int gameCount, int goalCount) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.gameCount = gameCount;
        this.goalCount = goalCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public int getGoalCount() {
        return goalCount;
    }

    public void setGoalCount(int goalCount) {
        this.goalCount = goalCount;
    }

    public boolean isReserve() {
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", gameCount=" + gameCount +
                ", goalCount=" + goalCount +
                ", reserve=" + reserve +
                '}';
    }
}
