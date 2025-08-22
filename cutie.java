import java.sql.*;
import java.util.*;

class V{
  public static void main(String[]a)throws Exception{
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost/db","u","p");
    Scanner s=new Scanner(System.in);
    String u=s.nextLine();
    c.createStatement().execute("SELECT * FROM users WHERE name='"+u+"'");
  }
}
