package gettersAndSetters.homeworkTasks;

public class Footballer
{
    private String firstName;
    private String lastName;
    private String position;
    private int gamesCount;
    private int goalsCount;
    private boolean reserve = false;

    public Footballer(){};
    public Footballer(String firstName, String lastName, String position, int gamesCount, int goalsCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.gamesCount = gamesCount;
        this.goalsCount = goalsCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public int getGamesCount() {
        return gamesCount;
    }

    public void setGamesCount(int gamesCount) {
        this.gamesCount = gamesCount;
    }

    public int getGoalsCount() {
        return goalsCount;
    }

    public void setGoalsCount(int goalsCount) {
        this.goalsCount = goalsCount;
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
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", gamesCount=" + gamesCount +
                ", goalsCount=" + goalsCount +
                ", reserve=" + reserve +
                '}';
    }
}
