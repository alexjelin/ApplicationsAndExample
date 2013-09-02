/*
 * konzolno prilojenie za namirane na element ot masiv dali e po golqmo ot sasednite
 * si! v sluchai che ne e da se vryshta -1;
 */
package arrayexercise;

public class ArrayExercise {

    public static void arraySearchAndReturn(int[] array) {
        for (int counter = 1; counter < array.length; counter++) {

            if (array[counter] > array[counter + 1] && array[counter] > array[counter - 1]) {
                System.out.printf("Parviqt element po golqm ot drygite sasednite si e "
                        + "%d!\n", array[counter]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2,444, 1, 1,1, 4, 6};
        arraySearchAndReturn(array);
    }
}
