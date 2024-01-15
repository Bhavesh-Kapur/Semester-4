import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ADBMS", "root", "root");
            statement = connection.createStatement();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter id: ");
            String uid = scanner.nextLine();
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            String insert = "INSERT INTO details (uid, name) " +
                    "VALUES ('" +uid+ "', '" +name+ "')";
            int rowsAffected = statement.executeUpdate(insert);
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Data insertion failed.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } 
    }
}
