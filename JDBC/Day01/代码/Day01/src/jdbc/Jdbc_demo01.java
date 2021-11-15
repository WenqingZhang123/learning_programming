package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc_demo01  {
    public static void main(String[] args) throws Exception {

        //可以省略：因为meta-inf - service - java.sql.Driver
        //Class.forName("com.mysql.jdbc.Driver");

        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db5", "root", "258789zwq!");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///db5", "root", "258789zwq!");

        String sql = "update account set balance = 304 where id = 1";

        Statement stmt = conn.createStatement();

        int count = stmt.executeUpdate(sql);

        System.out.println(count);

        stmt.close();
        conn.close();


    }
}
