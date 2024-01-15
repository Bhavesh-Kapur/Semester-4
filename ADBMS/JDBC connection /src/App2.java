//Create a database of employee of company in mysql and then use java program to access the database for inserting 
//information of employees in database. The SQL statement can be used to view the details of the data of employees in the database.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            // Connect to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ADBMS", "root", "root");
            // Create a statement object
            statement = connection.createStatement();
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);
            // Prompt the user for input
            System.out.print("Enter id: ");
            String uid = scanner.nextLine();
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            // Insert data into the employees table
            String insertDataSQL = "INSERT INTO details (uid, name) " +
                    "VALUES ('" +uid+ "', '" +name+ "')";
            int rowsAffected = statement.executeUpdate(insertDataSQL);
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Data insertion failed.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
