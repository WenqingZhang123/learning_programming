package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_demo04 {
    public static void main(String[] args) {

        Connection conn = null;

        Statement stm = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String sql = "delete from  account where id =3";

            conn = DriverManager.getConnection("jdbc:mysql:///db5","root", "258789zwq!");

            stm = conn.createStatement();

            int count =stm.executeUpdate(sql);

            System.out.println(count);

            if(count > 0){
                System.out.println("删除数据成功");
            }else{
                System.out.println("删除数据失败");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
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
