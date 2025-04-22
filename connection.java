import java.sql.*;

public class connection 
{
        Connection conn;
        Statement st;
        public connection()throws Exception
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcity_db", "root", "");
            st=conn.createStatement();
        }
}
