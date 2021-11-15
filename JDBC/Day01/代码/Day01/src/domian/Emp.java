package domian;

import java.util.Date;

public class Emp {
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
    private int id;
    private String ename;
    private int job_id;
    private  int mgr;
    private Date joindate;
    private double salary;
    private double bonus;
    private int dept_id;

    public int getId() {
        return id;
    }

    public String getEname() {
        return ename;
    }

    public int getJob_id() {
        return job_id;
    }

    public int getMgr() {
        return mgr;
    }

    public Date getJoindate() {
        return joindate;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", job_id=" + job_id +
                ", mgr=" + mgr +
                ", joindate=" + joindate +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", dept_id=" + dept_id +
                '}';
    }
}
