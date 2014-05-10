package sortfactory;

public class SortOrder {

    public class Upward implements Sortable {

        @Override
        public void count(int[] cMatrix) {
            int max = cMatrix[0];
            for (int j = 1; j < cMatrix.length; j++) {
                if (max < cMatrix[j]) {
                    max = cMatrix[j];
                }
            }
            int k = max;
            int counts[] = new int[k + 1];
            int[] sortedArray = new int[cMatrix.length];
            for (int i = 0; i < counts.length; i++) {
                counts[i] = 0;
            }

            for (int j = 0; j < cMatrix.length; j++) {
                counts[cMatrix[j]]++;
            }

            for (int i = 1; i <= k; i++) {
                counts[i] = counts[i] + counts[i - 1];

            }
            for (int j = cMatrix.length - 1; j >= 0; j--) {
                sortedArray[counts[cMatrix[j]] - 1] = cMatrix[j];
                counts[cMatrix[j]] = counts[cMatrix[j]] - 1;
            }
        }
    }

    public Sortable getUpwardSort() {
        return new Upward();
    }
}
