<%@ page import = "java.sql.*" %>
<%
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
         		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ADBMS", "root", "root");
		String query = "select * from details";
	         	Statement st = con.createStatement();
         		ResultSet rs = st.executeQuery(query);  			
         		while(rs.next())
         		{
            			out.println("<br>" + rs.getInt(1) + "--" + rs.getString(2));
	         	}
		rs.close();
		st.close();
		con.close();
	}
	catch(Exception e) 
	{
		out.println(e);
	}
%>