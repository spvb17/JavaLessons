package gettersAndSetters.examples;

public class FirstTask
{
    public static void main(String[] args) {
        User user1 = new User(29545, "10gmail.com", "qwerty");
        User user2 = new User(39221, "dfsdf.@mail.com", "dlfjad;");
        User user3 = new User(39922, "abc.@gmail.com", "dfsqq");
        User[] arr = {user1, user2, user3};
        for(int i=0; i<arr.length; ++i)
        {
            System.out.println(arr[i].getLogin());
        }
        for(int i=0; i<arr.length; ++i)
        {
            arr[i].idDecrease();
            System.out.println(arr[i].getId());
        }
    }
}

class User
{
    private int id;
    private String login;
    private String password;
    private boolean dlsk;

    public User(){};
    public User(int id, String login, String password)
    {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void idDecrease()
    {
        id-=1;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
