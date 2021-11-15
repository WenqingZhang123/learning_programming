package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class Jdbc_demo02 {
    public static void main(String[] args)  {

        Connection conn = null;
        Statement stm = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String sql = "insert into account values(null,'wuWang',2000)";

            conn = DriverManager.getConnection("jdbc:mysql:///db5", "root", "258789zwq!");

            stm = conn.createStatement();

            int count = stm.executeUpdate(sql);

            System.out.println(count);

            if(count>0){
                System.out.println("成功添加新人");
            }else {
                System.out.println("添加新人失败");
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
