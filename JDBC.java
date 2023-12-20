import java.sql.*;

public class DisplayRecords {
    public static void main(String[] args) {
        // Database connection details
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try {
            // Step 1: Load and register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish a database connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Step 3: Create a SQL query to retrieve all records from the table
            String sqlQuery = "SELECT * FROM your_table";

            // Step 4: Create a Statement object to execute the SQL query
            Statement statement = connection.createStatement();

            // Step 5: Execute the query and obtain a ResultSet
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // Step 6: Iterate through the ResultSet and display the records
            while (resultSet.next()) {
                // Assuming a sample table with columns "column1", "column2", etc.
                System.out.println("Column1: " + resultSet.getString("column1"));
                System.out.println("Column2: " + resultSet.getString("column2"));
                // Add similar lines for other columns
                System.out.println("-----------------------");
            }

            // Step 7: Close the ResultSet, Statement, and Connection
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
