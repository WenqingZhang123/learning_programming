package jdbc;

import java.sql.*;

public class Jdbc_demo07 {
    public static void main(String[] args) {

        Connection conn = null;

        Statement stm = null;

        ResultSet rest = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String sql = "select * from account";

            conn = DriverManager.getConnection("jdbc:mysql:///db5","root", "258789zwq!");

            stm = conn.createStatement();

            rest =stm.executeQuery(sql);

            while (rest.next()){
                int id  = rest.getInt(1);
                String name = rest.getString(2);
                double salary = rest.getDouble(3);

                System.out.println(id + "----" + name + "----" + salary);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {

            try {
                rest.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                stm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}