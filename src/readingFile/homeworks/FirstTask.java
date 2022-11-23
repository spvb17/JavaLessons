package readingFile.homeworks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class FirstTask
{
    public static void main(String[] args) throws FileNotFoundException
    {
        User user1 = new User(29545, "saparalievb17@gmail.com", "7740");
        User user2 = new User(29544, "daneliya884@gmail.com", "1888");
        User user3 = new User(29531, "aidaamalbek@mail.ru", "8899");
        User[] users = {user1, user2, user3};
        saveUserList(users);
        System.out.println(Arrays.toString(getUserList()));
    }

    public static String[] getUserList() throws FileNotFoundException
    {
        File file = new File("users");
        Scanner scanner = new Scanner(file);

        String[] arr = new String[3];
        int j = 0;
        while(scanner.hasNext())
        {
            arr[j++] = scanner.nextLine();
        }
        return arr;
    }

    public static void saveUserList(User[] arr) throws FileNotFoundException
    {
        File file = new File("users");
        PrintWriter pw = new PrintWriter(file);
        for(User x:arr)
        {
            pw.println(x);
        }
        pw.close();
    }
}

class User
{
    private int id;
    private String login;
    private String password;

    public User(){}
    public User(int id, String login, String password) {
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}