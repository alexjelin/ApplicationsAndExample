package primenrnokontrolno;

public class MySort {

    private ISortable test;

    public ISortable getTest() {
        return test;
    }

    public void setTest(ISortable test) {
        this.test = test;
    }

    public MySort(int i) {
        SordOrder c = new SordOrder();
        if (i == 1) {
            ISortable a = c.getUpward();
            this.test = a;
        } else {
            ISortable b = c.DownWard();
            this.test = b;
        }
    }

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (test.greater(array[i], array[j])) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        return array;
    }
}
