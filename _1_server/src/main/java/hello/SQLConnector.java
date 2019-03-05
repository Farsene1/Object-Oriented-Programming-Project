package hello;

import java.sql.*;

public class SQLConnector {
    private final String url = "jdbc:postgresql://localhost:5432/test_gogreen";
    private final String user = "root";
    private final String password = "root";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public void getAllTuples(){
        String SQL = "SELECT * FROM users";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            // display actor information
            while (rs.next()) {
                // Read values using column name
                int id = rs.getInt("id");
                String hash = rs.getString("hash");
                String username = rs.getString("username");

                System.out.println(String.format("%d, %s, %s", id, hash,
                        username));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
