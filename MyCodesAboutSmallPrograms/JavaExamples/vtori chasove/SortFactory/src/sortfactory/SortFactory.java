package sortfactory;

public class SortFactory {

    private Sortable someObject;

    public Sortable getSomeObject() {
        return someObject;
    }

    public void setSomeObject(Sortable someObject) {
        this.someObject = someObject;
    }

    public SortFactory(Sortable obj) {
        setSomeObject(obj);
    }

    public void sort(int[] array) {
        someObject.count(array);
    }
}
