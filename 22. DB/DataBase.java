import java.sql.*;

public class DataBase {

    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");

        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select * from student");

        while (rs.next()) {
            System.out.print(rs.getInt("roll") + " ");

        }
        rs.close();
        stm.close();

    }

}
