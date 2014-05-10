package insertionsortexample;

public class SelectionSort {

    public static void selectionSort(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalarie() > employees[j].getSalarie()) {
                    double temp = employees[i].getSalarie();
                    double temp2 = employees[j].getSalarie();
                    temp = temp2;
                    temp2 = employees[i].getSalarie();
                }
            }
        }
    }
}
