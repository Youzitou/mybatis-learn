package hbeu.lyy.interfaces;

/**
 * @autohor liuyouyun
 * @date 2019/6/27 - 22:38
 */

import hbeu.lyy.pojo.Student2;

import java.util.List;

/**
 * 操作mybatis的接口
 */
public interface Student2Mapper {
    /**
     * 1方法名和mapper.xml文件中标签的id相同
     * 2方法的输入参数和mapper.xml文件中标签的parameterType类型一致
     * 3方法的返回值和mapper.xml文件标签的resultType类型一致
     *
     * 除了以上约定，要实现接口中的党法和mapper.xml中SQL标签一一对应，话需要以下1点：
     * 1 namespace的值就是接口的全类名
     */
    Student2 queryStudent2ById(int id);

    List<Student2> queryAllStudent2();

    void addStudent2(Student2 student2);
}
