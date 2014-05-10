package callbackexirciseinuniversity;

public class SortMethod {

    private ISortable object;

    public ISortable getObject() {
        return object;
    }

    public void setObject(ISortable object) {
        this.object = object;
    }

    public SortMethod(ISortable someObj) {
        setObject(someObj);
    }

    public int[] exucute() {
        return object.sort();
    }
}
