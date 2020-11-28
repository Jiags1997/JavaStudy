package cn.edu.Jlu.Day04JDBCDataSource.DruidDemo;

import cn.edu.Jlu.Day04JDBCDataSource.Utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RruidUtilsDemo {
    public static void main(String[] args) {
        //完成添加操作
        Connection conn=null;
        PreparedStatement pstmt=null;


        try {
            //1.获取连接
            conn=JDBCUtils.getConnection();
            //2.定义sql
            String sql="insert into account values(null,?,?)";
            //3获取PreparedStatent 对象
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,"naruto");
            pstmt.setDouble(2,2000);
            int count=pstmt.executeUpdate();
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }

    }
}
