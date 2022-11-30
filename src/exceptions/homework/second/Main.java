package exceptions.homework.second;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        Connection connection = DatabaseDriverUtil.getConnection("https://bitlab.kz:3306/", "maindatabase", "root", "bitlab2017");
        System.out.println(Arrays.toString(connection.getUserList()));
    }
}
