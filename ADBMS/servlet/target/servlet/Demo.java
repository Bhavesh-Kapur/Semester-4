import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
@WebServlet(name = "Demo", urlPatterns = {"/Demo"})
public class Demo extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ADBMS", "root", "root");
            String query1 = "select * from Details";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);

            // Set data as an attribute in the request object
            request.setAttribute("resultData", rs);

            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Forward the request and response to the index.html page
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
        dispatcher.forward(request, response);
    }
}
