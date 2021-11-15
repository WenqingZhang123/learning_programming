package jdbc;

import jdbc_util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class Jdbc_demo11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请贵宾输入登陆账户");
        String user_name = sc.nextLine();
        System.out.println("请贵宾输入密码");
        String password = sc.nextLine();

        Boolean bl = new Jdbc_demo11().login(user_name,password);

        if(bl){
            System.out.println("查到尊贵的V10用户信息，欢迎回家！");
        }else {
            System.out.println("抱歉请检查信息 或 先注册");
        }
    }
    /*public boolean login2(String username ,String password){
        if(username == null || password == null){
            return false;
        }
        //连接数据库判断是否登录成功
        Connection conn = null;
        PreparedStatement pstmt =  null;
        ResultSet rs = null;
        //1.获取连接
        try {
            conn =  JDBCUtils.getConnection();
            //2.定义sql
            String sql = "select * from user where username = ? and password = ?";
            //3.获取执行sql的对象
            pstmt = conn.prepareStatement(sql);
            //给?赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            //4.执行查询,不需要传递sql
            rs = pstmt.executeQuery();
            //5.判断
           *//* if(rs.next()){//如果有下一行，则返回true
                return true;
            }else{
                return false;
            }*//*
            return rs.next();//如果有下一行，则返回true

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstmt,conn);
        }


        return false;
    }*/
    public boolean login(String user_name, String password){
        //提高方法执行门槛
        if(user_name == null || password == null){
            return  false;
        }
        //正式开始
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();

            String sql = "select * from user where username = ? and password  = ?";

            pstm = conn.prepareStatement(sql);

            pstm.setString(1,user_name);
            pstm.setString(2,password);

            rs = pstm.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, pstm, conn);
        }

        return  false;
    }
}
