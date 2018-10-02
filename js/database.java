/*
  This databse class connects to a goDaddy sql database.
  Username is OwenPiercey002 for godaddy
*/

public class database{

    String uname = (request.getParameter("uname")).toLowerCase();
		String pass = request.getParameter("pass");

    Login log = new Login();

		MyDatabase database = new MyDatabase();

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:mysql://107.180.51.87:3306/guardMate", log.getUName, log.getPass);
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from guardMate where name='" + uname + "' and password='" + pass + "'");

				if(rs.next()) {
					HttpSession session = request.getSession();
					session.setAttribute("username", uname);
					database.setUser(uname);
					response.sendRedirect("dashboard.jsp");

				}else {
					response.sendRedirect("index.jsp");
				}
			}catch (SQLException s){
				System.err.println("SQL statement is not executed");
			}

		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
			response.sendRedirect("index.jsp");
		}

}
