package cn.wyu.stu;

public class Student {
    private String sno;
    private String sname;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Student(String sno, String sname) {
        this.sno = sno;
        this.sname = sname;
    }
}
