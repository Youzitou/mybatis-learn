package hbeu.lyy.test;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @autohor liuyouyun
 * @date 2019/6/26 - 19:55
 */

/**
 * 实现步骤：
 * 1.mybatis-generator-core.jar    mybatis.jar  mysql驱动
 * 2.逆向工程的配置文件generator.xml
 * 3.执行
 */
public class GeneratorTest {
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        File file = new File("D:\\IDEA_project\\mybatis-learn\\src\\main\\resources\\generator.xml");
        //   File file = new File("D:\IDEA_project\mybatis-learn\src\main\resources\generator.xml");
        List<String> warnings = new ArrayList<String>();

        ConfigurationParser cp = new ConfigurationParser(warnings);

        Configuration config = cp.parseConfiguration(file);

        DefaultShellCallback callback = new DefaultShellCallback(true);

        // 逆向工程的核心类
        MyBatisGenerator generator = new MyBatisGenerator(config, callback, warnings);
        generator.generate(null);
    }

}
