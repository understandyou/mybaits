package com.zys;

import com.zys.dao.StudentMapper;
import com.zys.entitys.Student;
import com.zys.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        SqlSession sqlsession = MybatisUtil.getSqlsession();

        Student blog = sqlsession.selectOne("com.zys.entitys.Student", 1);

//        StudentMapper mapper = sqlsession.getMapper(StudentMapper.class);
//        Student student = mapper.selectByPrimaryKey(1);
//
//        System.out.println(student);

        sqlsession.close();
    }
}
