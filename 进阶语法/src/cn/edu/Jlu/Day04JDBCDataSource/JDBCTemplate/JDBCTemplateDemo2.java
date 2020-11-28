package cn.edu.Jlu.Day04JDBCDataSource.JDBCTemplate;


import cn.edu.Jlu.Day04JDBCDataSource.Utils.JDBCUtils;
import cn.edu.Jlu.Day04JDBCDataSource.domain.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JDBCTemplateDemo2 {

    //单元测试，可以让方法独立执行
    private JdbcTemplate jt=new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 修改一号数据的的salary为10000
     */
    @Test
    public void test1(){
        //1.获取JDBCTemolate对象

        //2.定义sql
         String sql="update emp set salary=10000 where id=1001";
         int count=jt.update(sql);
        System.out.println(count);

    }

    /**
     * 添加一条数据
     */
    @Test
    public void test2(){
        String sql="insert into emp(id,ename,dept_id) values(?,?,?)";
        int count=jt.update(sql,1015,"郭靖",10);//防止sql注入
        System.out.println(count);
    }

    /**
     * 删除刚才添加的记录
     */
    @Test
    public void test3(){
        String  sql="delete from emp where id=?";
        int count=jt.update(sql,1015);
        System.out.println(count);
    }

    /**
     * 查询emp表中的记录封装为map
     * 注意：这个方法的查询结果集长度只能是1
     */
    @Test
    public void  test4(){
        String sql="select * from emp where id=?";
        Map <String,Object> map=jt.queryForMap(sql,1001);
        //{id=1001, ename=孙悟空, job_id=4, mgr=1004, joindate=2000-12-17, salary=10000.00, bonus=null, dept_id=20}
        System.out.println(map);
    }

    /**
     * 查询emp表所有内容，封装成List集合
     */
    @Test
    public void  test5(){
        String sql="select * from emp";
        List<Map<String, Object>> maps = jt.queryForList(sql);
        maps.stream().forEach((map)-> System.out.println(map));
    }

    /**
     * 查询所有记录，将其封装为Emp对象的List集合
     */
    @Test
    public  void test6(){
        String sql="select * from emp";
        List<Emp> list=jt.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {

                Emp emp = new Emp();
                Integer id=resultSet.getInt("id");
                String ename = resultSet.getString("ename");
                Integer job_id = resultSet.getInt("job_id");
                Integer mgr = resultSet.getInt("mgr");
                Date joinDate = resultSet.getDate("joinDate");
                Double salary = resultSet.getDouble("salary");
                Double bonus = resultSet.getDouble("bonus");
                Integer dept_id = resultSet.getInt("dept_id");
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoinDate(joinDate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                return emp;
            }
        });

         list.stream().forEach(emp-> System.out.println(emp));

    }

    /**
     * 使用Spring框架提供好的接口实现步骤六
     */
    @Test
    public void test7(){
        String sql="select * from emp";
        List<Emp>list=jt.query(sql,new BeanPropertyRowMapper<Emp>(Emp.class));

        list.stream().forEach(emp -> System.out.println(emp));
    }

    /**
     * 查询emp表中记录数量
     */
    @Test
    public  void test8(){
        String sql="select count(id) from emp";
        Long total=jt.queryForObject(sql,Long.class);
        System.out.println(total);
    }
}
