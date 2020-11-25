package cn.edu.Jlu.Day03JDBC.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo01 {
    public static void main(String[] args)  throws Exception{
        //1.导入jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接对象

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","jiags1997");

        //4 定义sql语句
        String sql="update account set balance=500 where id =1;";

        //5 获取执行sql语句的对象
         Statement stmt=con.createStatement();
         //6 执行sql
        int  count=stmt.executeUpdate(sql);
        //7处理结果
        System.out.println(count);
        //8 释放资源
        stmt.close();
        con.close();








    }
}


