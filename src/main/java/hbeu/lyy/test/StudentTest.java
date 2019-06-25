package hbeu.lyy.test;

import hbeu.lyy.pojo.Student;
import hbeu.lyy.pojo.User;
import hbeu.lyy.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * @autohor liuyouyun
 * @date 2019/6/25 - 21:26
 */
public class StudentTest {
    @Test
    public void userFindByIdTest() {
        SqlSession session  = MybatisUtil.getSession(true);
        String statement = "hbeu.lyy.pojo.Student.findById";
        Student student = new Student();
        student.setId(1);
       session.selectOne(statement,student);
        System.out.println(student);

    }

}
