package bucketsort;

public class BucketSort {

    public void sort(int number, int[] array) {
        if (number <= 0) {
            return;                                   // Case of empty array
        }
        int min = array[0];
        int max = min;
        for (int i = 1; i < number; i++) // Find the minimum and maximum
        {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        int bucket[] = new int[max - min + 1];          // Create buckets

        for (int i = 0; i < number; i++) // "Fill" buckets
        {
            bucket[array[i] - min]++;                   // by counting each datum
        }
        int i = 0;
        for (int b = 0; b < bucket.length; b++) // "Empty" buckets
        {
            for (int j = 0; j < bucket[b]; j++) // back into array
            {
                array[i++] = b + min;                     // by creating one per count
            }
        }
    }
}
