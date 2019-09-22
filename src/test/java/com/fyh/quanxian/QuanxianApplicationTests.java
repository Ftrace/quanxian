package com.fyh.quanxian;

import com.fyh.quanxian.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuanxianApplicationTests {

    @Autowired
    DataSource dataSource;
    @Resource
    UserDao userDao;
    @Test
    public void contextLoads() {
        System.out.println(dataSource.getClass());
        System.out.println(userDao.getUser("张三"));
    }

}
