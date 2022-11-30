package exceptions.homework.second;

public class Connection
{
    public User[] getUserList()
    {
        User user1 = new User("Nurdana", "Amalbek", "123@gmail.com", "password");
        User user2 = new User("Guldana", "Abdiadi", "889dana@gmail.com", "passcode");
        User user3 = new User("Begzhan", "Saparaliev", "spvb17@gmail.com", "mypassword");
        User[] users = {user1, user2, user3};
        return users;
    }
}
