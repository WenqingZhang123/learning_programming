package jdbc;

import java.sql.*;

public class Jdbc_demo06 {
    public static void main(String[] args) {

        //下述为不正确使用----ResultSet的next()和getXxx()方法

        Connection conn = null;

        Statement stm = null;

        ResultSet rest = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String sql = "select * from account";

            conn = DriverManager.getConnection("jdbc:mysql:///db5","root", "258789zwq!");

            stm = conn.createStatement();

            rest =stm.executeQuery(sql);

            rest.next();
            int id  = rest.getInt(1);
            String name = rest.getString(2);
            double salary = rest.getDouble(3);

            System.out.println(id + "----" + name + "----" + salary);

            /*if(count > 0){
                System.out.println("删除数据成功");
            }else{
                System.out.println("删除数据失败");
            }*/
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