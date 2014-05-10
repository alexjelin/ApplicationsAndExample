package employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SortEmployee {

    public Employee[] mergeSort(Employee[] employees) {
        SortArray(0, employees.length - 1, employees);
        return employees;
    }

    public void SortArray(int low, int high, Employee[] data) {
        if ((high - low) > -1) {
            int middle1 = (low + high) / 2;
            int middle2 = middle1 + 1;

            SortArray(low, middle1, data);
            SortArray(middle2, high, data);

            merge(low, middle1, middle2, high, data);
        }
    }

    public void merge(int left, int middle1, int middle2, int right, Employee[] data) {
        int leftIndex = left;
        int rightIndex = middle2;

        int combineIndex = left;
        Employee[] combine = new Employee[data.length];

        while (leftIndex <= middle1 && rightIndex <= right) {
            if (data[leftIndex].greaterBySalary(data[rightIndex])) {
                combine[combineIndex++] = data[rightIndex++];
            } else {
                combine[combineIndex++] = data[leftIndex++];
            }

            if (leftIndex == middle2) {
                while (rightIndex <= right) {
                    combine[combineIndex++] = data[rightIndex++];
                }
            } else {
                while (leftIndex <= left) {
                    combine[combineIndex++] = data[leftIndex++];
                }
            }
            for (int i = left; i <= right; i++) {
                data[i] = combine[i];
            }
        }
    }

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        Employee[] array = new Employee[3];
        array[0] = new Employee("Ivan", "Dimitrov", 555);
        array[1] = new Employee("Petyr", "Dimitrov", 587);
        array[2] = new Employee("Ivan", "Petrov", 586);

        SortEmployee test = new SortEmployee();
        Employee[] array1 = test.mergeSort(array);

        File fle1 = new File("SortedEmps.txt");
        FileOutputStream file2 = new FileOutputStream(fle1);
        ObjectOutputStream file3 = new ObjectOutputStream(file2);

        file3.writeObject(array1);
        file3.close();

        FileInputStream file4 = new FileInputStream(fle1);
        ObjectInputStream file5 = new ObjectInputStream(file4);
        Employee[] readArr = (Employee[]) file5.readObject();
        file5.close();

    }
}
