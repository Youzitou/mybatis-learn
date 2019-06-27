package hbeu.lyy.test;

import hbeu.lyy.pojo.Person;
import hbeu.lyy.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @autohor liuyouyun
 * @date 2019/6/27 - 22:02
 */
public class TestOracle {
    public static void main(String[] args) {
        SqlSession session = MybatisUtil.getSession(true);
        String statement = "mapper.personMapper.queryPersonById";
        Person person = session.selectOne(statement,2);
        System.out.println(person);
    }

}
