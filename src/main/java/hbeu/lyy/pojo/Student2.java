package hbeu.lyy.pojo;

/**
 * @autohor liuyouyun
 * @date 2019/6/27 - 22:46
 */
public class Student2 {

    private int id;

    private String stuname;

    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getAddress() {
        return address;
    }

    public Student2() {
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student2(int id, String stuname, String address) {
        this.id = id;
        this.stuname = stuname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", stuname='" + stuname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
