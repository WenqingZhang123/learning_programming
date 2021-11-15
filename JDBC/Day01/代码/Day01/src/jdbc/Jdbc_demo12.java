package jdbc;

import jdbc_util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_demo12 {
    public static void main(String[] args) {

        transfer(500,1, 500,2);
    }

    public static void transfer(int num1, int index1, int num2, int index2) {

        Connection conn = null;
        PreparedStatement pst1 = null;
        PreparedStatement pst2 = null;

        try {
            conn = JDBCUtils.getConnection();

            String str1 = "update account set balance = balance - ? where id = ?";
            String str2 = "update account set balance = balance + ? where id = ?";

            pst1 = conn.prepareStatement(str1);
            pst2 = conn.prepareStatement(str2);

            pst1.setInt(1, num1);
            pst1.setInt(2,index1);
            pst2.setInt(1,num2);
            pst2.setInt(2,index2);

            conn.setAutoCommit(false);

            pst1.executeUpdate();
            //产生异常，2个executeUpdate()只执行了一个。 开启事物来解决这个问题。
            //int a = 3/0;
            pst2.executeUpdate();

            conn.commit();

        } catch (Exception e) {
            try {
                if(conn != null) {
                    conn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pst1,conn);
            JDBCUtils.close(pst2,null);
        }
    }
}
