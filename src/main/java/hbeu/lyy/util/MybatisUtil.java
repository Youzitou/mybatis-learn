package hbeu.lyy.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @autohor liuyouyun
 * @date 2019/6/25 - 22:38
 */
public class MybatisUtil {

    public static SqlSessionFactory factory;

    public static SqlSessionFactory getFactory() {
        try {
            if (factory == null) {
                //Resources :访问资源文件工具类
                InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
                factory = new SqlSessionFactoryBuilder().build(is);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return factory;
    }

    // 设置是否自动提交事务
    public static SqlSession getSession(boolean isAutoCommit) {
        return getFactory().openSession(isAutoCommit);
    }

    public static SqlSession getSession() {
        return getFactory().openSession();
    }
}
