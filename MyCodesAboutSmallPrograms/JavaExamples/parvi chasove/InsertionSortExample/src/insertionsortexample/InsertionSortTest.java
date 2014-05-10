package insertionsortexample;

import insertionsortexample.SelectionSort;
import insertionsortexample.InsertionSort;
import sun.misc.Sort;

public class InsertionSortTest {
    
    public static void main(String[] args) {
        Employee obj1 = new Employee("Pesho", "Peshev", 587.36);
        Employee obj2 = new Employee("Ivan", "Peshev", 600);
        Employee obj3 = new Employee("Petyr", "Slabakov", 597.36);
        Employee obj4 = new Employee("Aleksandyr", "Chochov", 450);
        Employee obj5 = new Employee("Ddaniela", "Kehlibarova-Mihailova", 875.33);
        
        Employee[] objArr = new Employee[5];
        objArr[0] = obj1;
        objArr[1] = obj2;
        objArr[2] = obj3;
        objArr[3] = obj4;
        objArr[4] = obj5;
        
        InsertionSort test = new InsertionSort();
        test.sort(objArr);
        SelectionSort test2 = new SelectionSort();
        test2.selectionSort(objArr);
    }
}
