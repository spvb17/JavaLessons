package exceptions.homework.second;

public class DatabaseDriverUtil
{
    public static Connection getConnection(String url, String dbName, String userName, String password)
    {
        if(!url.equals("https://bitlab.kz:3306/")||!dbName.equals("maindatabase")||!userName.equals("root")||!password.equals("bitlab2017"))
        {
            try{
                throw new DatabaseIncorrectException();
            }
            catch(DatabaseIncorrectException e)
            {
                e.printStackTrace();
            }
        }
        return new Connection();
    }
}
