package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception {
        String sql = "SELECT name FROM users WHERE id = 5";
        String url = "jdbc:postgresql://localhost:5432/example"; // Corrected URL
        String name = "postgres";
        String password = "postgres";

        Connection con = DriverManager.getConnection(url, name, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        String data = "";
        if (rs.next()) { // Move the pointer to the first row
            data = rs.getString(1); // Access the first column (name)
        }

        System.out.println(data);

        // Close resources
        rs.close();
        st.close();
        con.close();
    }
}
