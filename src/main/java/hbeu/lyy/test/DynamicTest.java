package hbeu.lyy.test;

import hbeu.lyy.interfaces.Student2Mapper;
import hbeu.lyy.pojo.Student2;
import hbeu.lyy.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @autohor liuyouyun
 * @date 2019/6/27 - 22:36
 */
public class DynamicTest {
    public static void main(String[] args) {
         SqlSession session = MybatisUtil.getSession();
        Student2Mapper student2Mapper = session.getMapper(Student2Mapper.class);
        Student2 student2 = student2Mapper.queryStudent2ById(1);
        System.out.println(student2);

    }
}
