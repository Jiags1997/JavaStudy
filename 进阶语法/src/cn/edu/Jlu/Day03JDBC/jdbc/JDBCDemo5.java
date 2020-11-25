package cn.edu.Jlu.Day03JDBC.jdbc;

import cn.edu.Jlu.Day03JDBC.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo5 {
    /**
     * 查询所有的emp对象
     * @return
     */
    public static void main(String[] args) {
        List<Emp> list=new JDBCDemo5().findAll();
        System.out.println(list);
    }
    public  List<Emp>  findAll(){

        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        List<Emp> list=new ArrayList<>();
        try{
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.连接数据库
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "jiags1997");

            //3.获取操作sql的statement对象
            stmt=conn.createStatement();
            //4.定义sql语句
            String  sql="select * from  emp";
            //5.执行sql语句
            rs=stmt.executeQuery(sql);
            //6.遍历结果集，封装对象，装载集合

            while(rs.next()){
                //获取数据
                int id=rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                //创建对象
                Emp emp=new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoinDate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);
                list.add(emp);
            }

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try{
                if(rs!=null)
                    rs.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
            try{
                if(stmt!=null){
                    stmt.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
            try{
                if(conn!=null){
                    conn.close();

                }
            }catch (SQLException e){
                e.printStackTrace();
            }

        }
         return list;
    }
}

