package jdbc;

import jdbc_util.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_demo10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请贵宾输入登陆账户");
        String user_name = sc.nextLine();
        System.out.println("请贵宾输入密码");
        String password = sc.nextLine();

        Boolean bl = new Jdbc_demo10().login(user_name,password);

        if(bl){
            System.out.println("查到尊贵的V10用户信息，欢迎回家！");
        }else {
            System.out.println("抱歉请检查信息 或 先注册");
        }
    }

    public boolean login(String user_name, String password){
        //提高方法执行门槛
        if(user_name == null || password == null){
            return  false;
        }

        //正式开始
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();

            String sql = "select * from user where username = '"+user_name +"' and password= '"+password+"'";

            stm = conn.createStatement();

            rs = stm.executeQuery(sql);

            /*if(rs != null){
                return true;
            }else{
                return false;
            }*/

            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, stm, conn);
        }

        return  false;
    }
}
