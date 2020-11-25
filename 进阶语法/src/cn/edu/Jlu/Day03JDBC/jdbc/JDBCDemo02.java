package cn.edu.Jlu.Day03JDBC.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo02 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        //1.注册驱动
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //2.连接数据库
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","jiags1997");
            //3.返回执行sql对想法
            stmt= conn.createStatement();
            //4.定义sql语句
            String sql="insert into account (id,name,balance) values(3,'王五',2000)";

            //5执行语句sql
            int count=stmt.executeUpdate(sql);
            System.out.println(count);
                    if(count>0)
                        System.out.println("执行成功！");
                    else
                        System.out.println("执行失败！");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.getErrorCode();
        }finally {
            if(stmt!=null){
                try{
                    stmt.close();
                }catch (SQLException e){
                    System.out.println(e);
                }

            }
            if(conn!=null){
                try{
                    conn.close();

                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
