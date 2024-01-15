import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
class App{
public static void main(String args[]){
    try{
    String url ="jdbc:mysql://localhost:3306/ADBMS";
    String username="root";
    String password="root";
    String query="select * from details";
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con= DriverManager.getConnection(url, username, password);
    Statement stmt = con.createStatement();
    ResultSet rs=stmt.executeQuery(query);
    while (rs.next()) { 
        System.out.println(rs.getInt(1)+ " "+ rs.getString(2));
    }
    con.close();
}

catch(Exception e){
    System.out.println(e);
}
}
}