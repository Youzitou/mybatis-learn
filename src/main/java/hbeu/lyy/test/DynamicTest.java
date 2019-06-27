package hbeu.lyy.test;

import hbeu.lyy.interfaces.Student2Mapper;
import hbeu.lyy.pojo.Student2;
import hbeu.lyy.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @autohor liuyouyun
 * @date 2019/6/27 - 22:36
 */
public class DynamicTest {
    public static void main(String[] args) {
         //SqlSession session = MybatisUtil.getSession();// 手动提交事务
        SqlSession session = MybatisUtil.getSession(true);  //自当提交事务
        Student2Mapper student2Mapper = session.getMapper(Student2Mapper.class);
//        Student2 student2 = student2Mapper.queryStudent2ById(3);
//        System.out.println(student2);

        /**
         * 查询所有学生
         */
//        List<Student2> list = student2Mapper.queryAllStudent2();
//        for(Student2 student2:list){
//            System.out.println(student2);
//        }

        /**
         * 增加学生
         */
        student2Mapper.addStudent2(new Student2(5,"任正非","华为技术有限公司"));


        //session.commit();
        //session.close();
        /**
         * 再次查询
         */
        List<Student2> list = student2Mapper.queryAllStudent2();
        for(Student2 student2:list){
            System.out.println(student2);
        }

    }
}
