package cn.edu.Jlu.Day04JDBCDataSource.cp30;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 连接池参数的验证
 */
public class C3p0Demo2 {
    public static void main(String[] args) throws SQLException {

        DataSource ds=new ComboPooledDataSource();
        for (int i = 0; i < 11; i++) {
            Connection conn=ds.getConnection();
            System.out.println(i+":"+conn);
            if(i==5){
                conn.close();
            }

        }



    }
 }
