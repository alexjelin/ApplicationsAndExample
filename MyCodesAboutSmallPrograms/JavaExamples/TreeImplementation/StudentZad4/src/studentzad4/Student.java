package studentzad4;

public class Student implements Comparable<Object> {

    private String name;
    private int fnumber;

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            throw new NullPointerException("vaveli ste prazno ime!");
        }
    }

    public void setFnumber(int fnumber) {
        if (fnumber > 0) {
            this.fnumber = fnumber;
        } else {
            this.fnumber = 0;
        }
    }

    public Student() {
        this.name = "";
        this.fnumber = 0;
    }

    public Student(Student st) {
        this(st.name, st.fnumber);
    }

    public Student(String name, int fnumber) {
        setName(name);
        setFnumber(fnumber);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student copyS = (Student) o;
            if (this.fnumber > copyS.fnumber) {
                return 1;
            } else if (this.fnumber == copyS.fnumber) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
