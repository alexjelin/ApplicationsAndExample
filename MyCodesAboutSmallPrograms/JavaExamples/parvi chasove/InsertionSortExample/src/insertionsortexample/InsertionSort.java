package insertionsortexample;

public class InsertionSort {

    public static void sort(Employee[] employees) {
        int j;
        Employee key;
        int i;
        for (j = 1; j < employees.length; j++) {
            key = employees[j];
            for (i = j - 1; (i >= 0) && (employees[i].greater(key)); i--) {
                employees[ i + 1] = employees[ i];
            }
            employees[ i + 1] = key;
        }
    }
}
