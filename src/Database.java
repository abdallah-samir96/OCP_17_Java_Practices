import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
    @SafeVarargs
    public static <T> void printElements(T... elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) throws SQLException {

        var connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/simple_db", "postgres", "12345");
        connection.setAutoCommit(false);

        var ps = connection
                .prepareStatement("insert into user_info(name, details) values(?, ?)",
                        ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE
                        );
       // var point1 = connection.setSavepoint();
        ps.setString(1, "Ahmed");
        ps.setString(2, "Ahmed");
        ps.executeUpdate();

        var point2 = connection.setSavepoint();
        ps.setString(1, "Mohamed");
        ps.setString(2, "Mohamed");
        ps.executeUpdate();

        //connection.rollback(point2);
        /*
        connection.rollback(point2);
        connection.rollback(point1);
*/

        //var execute = stmt.execute();
        //var resultSet = stmt.executeQuery();
        //var f = stmt.executeUpdate();

    }

    private static void check(){
        var sql = "UPDATE names SET name = 'Animal'";
        try (var conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");
             var ps = conn.prepareStatement(sql)) {
            var result = ps.executeUpdate();
            System.out.println(result);
        }catch (SQLException sqls){

        }
    }
}
