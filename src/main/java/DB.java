import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by casey on 12/12/16.
 */
class DB
{
    public DB() {}

    public void dbConnect(String db_connect_string,
                          String db_userid, String db_password)
    {
        try
        {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    db_connect_string, db_userid, db_password);
            System.out.println("connected");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
