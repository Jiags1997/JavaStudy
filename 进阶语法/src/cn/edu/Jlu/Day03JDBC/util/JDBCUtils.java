package cn.edu.Jlu.Day03JDBC.util;


import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/*
  jdbc工具类
 */
public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    static{
        Properties  pro=new Properties();
        try {
            //获取class目录下的配置文件
            ClassLoader classLoader= JDBCUtils.class.getClassLoader();
            InputStream is=classLoader.getResourceAsStream("jdbc.properties");
            //URL res=classLoader.getResource("jdbc.properties");
            //String path=res.getPath();
           // pro.load(new FileReader(path));

            pro.load(is);//将文件加载到内存
        } catch (IOException e) {
            e.printStackTrace();
        }
        url=pro.getProperty("url");
        user=pro.getProperty("user");
        password=pro.getProperty("password");
        driver=pro.getProperty("driver");
        // 注册驱动
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * 获取连接的方法
     * @return
     */
    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url,user,password);

    }

    /**
     * 释放资源方法
     * @param stmt
     * @param conn
     */
    public static void close(Statement stmt,Connection conn){
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    /**
     * 释放资源方法
     * @param rs
     * @param stmt
     * @param conn
     */
    public static void close(ResultSet rs,Statement stmt, Connection conn){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
