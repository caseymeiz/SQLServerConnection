/**
 * Created by casey on 12/12/16.
 */
import java.sql.*;

public class Main
{
    public static void main(String[] args)
    {
        DB db = new DB();
        db.dbConnect("jdbc:jtds:sqlserver://myserver:myport/mydatabase;instance=SQLEXPRESS","login","password");
    }
}


