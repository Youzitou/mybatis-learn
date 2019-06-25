package hbeu.lyy.test;


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
 * @date 2019/6/25 - 20:35
 */
public class UserTest {


    @Test
    public void userFindByIdTest() {
        SqlSession session = MybatisUtil.getSession(true);
        User user = session.selectOne("findById", 1);
        //输出结果
        System.out.println(user.getUname());
        //关闭session
        session.close();

    }

}
