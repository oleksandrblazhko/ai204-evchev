import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQL {

  public static void main(final String[] args) {

    try {
      Class.forName("org.postgresql.Driver");
      Connection connection = DriverManager.getConnection(
          "jdbc:postgresql://localhost:5455/evchevdb",
          "postgres", "4213");

      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("select * from sport_types");

      while (resultSet.next()) {
        System.out.println(resultSet.getString(1) + " | " + resultSet.getString(2));
      }

      connection.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}