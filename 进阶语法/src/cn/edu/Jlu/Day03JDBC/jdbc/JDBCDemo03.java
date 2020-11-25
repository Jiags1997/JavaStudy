package cn.edu.Jlu.Day03JDBC.jdbc;

import java.sql.*;

public class JDBCDemo03 {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        //1.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2.连接数据库
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "jiags1997");
            //3.返回执行sql对想法
            stmt = conn.createStatement();
            //4.定义sql语句
            String sql = "select *from account";

            //5执行语句sql
            rs = stmt.executeQuery(sql);
            while (rs.next()) {//循环判断游标是否是最后一行
                int id = rs.getInt(1);
                String name = rs.getString(2);
                double balbance = rs.getDouble(3);
                System.out.println(id+"..."+name+"..."+balbance);

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.getErrorCode();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }


                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        System.out.println(e);
                    }

                }
                if (conn != null) {
                    try {
                        conn.close();

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
