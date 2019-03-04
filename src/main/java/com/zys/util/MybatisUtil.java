package com.zys.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        String resource = "mybatis/mybatis-config.xml";
        try {
//            Reader resourceAsReader = Resources.getResourceAsReader(resource);
            //sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);

            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private MybatisUtil(){}

    public static SqlSession getSqlsession(){
        return sqlSessionFactory.openSession();
    }
}
