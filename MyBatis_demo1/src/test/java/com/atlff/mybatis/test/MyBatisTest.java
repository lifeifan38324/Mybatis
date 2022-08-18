package com.atlff.mybatis.test;

import com.atlff.mybatis.mapper.UserMapper;
import com.atlff.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author lifeifan
 * @Description
 * @create 2022-08-17 22:31
 */
public class MyBatisTest {
    /**
     * SqlSession默认不自动提交事务，若需要自动提交
     * 可以使用SqlSessionFactory.openSession(true);
     * @throws IOException
     */
    @Test
    public void testMyBatis() throws IOException {
        //加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.insertUser();
        //提交事务
//        sqlSession.commit();
        System.out.println("被修改的行数 = " + i);
    }

    @Test
    public void testCRUD() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int i = mapper.updateUser();
//        System.out.println("i = " + i);
//        int i1 = mapper.deleteUser();
//        System.out.println("i1 = " + i1);
//        User user = mapper.getUserById();
//        System.out.println(user);
        List<User> allUser = mapper.getAllUser();
        for(User u:allUser){
            System.out.println(u);
        }
    }
}
