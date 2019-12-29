package entity;

public class StudentHaseConstructor {

    private long sid;
    private String sname;

    public StudentHaseConstructor(long sid,String sname){
        this.sid = sid;
        this.sname = sname;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "StudentHaseConstructor{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}
