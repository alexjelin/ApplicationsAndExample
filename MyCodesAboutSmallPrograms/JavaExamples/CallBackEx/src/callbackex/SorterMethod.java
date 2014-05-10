package callbackex;

public class SorterMethod {

    private ISortable obj1;

    public ISortable getObj1() {
        return obj1;
    }

    public void setObj1(ISortable obj1) {
        this.obj1 = obj1;
    }

    public SorterMethod(ISortable obj) {
        setObj1(obj);
    }

    public int[] exucute() {
        return obj1.sort();
    }
}
