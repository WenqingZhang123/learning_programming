package jdbc;

import domian.Emp;
import jdbc_util.JDBCUtils;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class Jdbc_demo09 {
    public static void main(String[] args) {
        List <Emp> list = new Jdbc_demo08().findAll();
        System.out.println(list);
        System.out.println(list.size());
    }

    public List<Emp> findAll(){

        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        List <Emp> lis = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String sql = "select * from emp";

            //conn = DriverManager.getConnection("jdbc:mysql:///db4","root","258789zwq!");
            conn = JDBCUtils.getConnection();
            stm = conn.createStatement();

            rs = stm.executeQuery(sql);
            Emp employee = null;

            lis = new ArrayList<>();
            while (rs.next()){
                /*
                 `id` int NOT NULL,
              `ename` varchar(50) DEFAULT NULL,
              `job_id` int DEFAULT NULL,
              `mgr` int DEFAULT NULL,
              `joindate` date DEFAULT NULL,
              `salary` decimal(7,2) DEFAULT NULL,
              `bonus` decimal(7,2) DEFAULT NULL,
              `dept_id` int DEFAULT NULL,
                 */
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                employee = new Emp();

                employee.setId(id);
                employee.setEname(ename);
                employee.setJob_id(job_id);
                employee.setMgr(mgr);
                employee.setJoindate(joindate);
                employee.setSalary(salary);
                employee.setBonus(bonus);
                employee.setDept_id(dept_id);

                lis.add(employee);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stm,conn);
        }

        return lis;
    }
}
