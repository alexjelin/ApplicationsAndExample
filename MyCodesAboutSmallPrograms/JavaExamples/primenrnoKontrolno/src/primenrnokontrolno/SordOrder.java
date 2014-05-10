package primenrnokontrolno;

public class SordOrder {

    public ISortable getUpward() {
        return new Upward();
    }

    public ISortable DownWard() {
        return new Downward();
    }

    private class Upward implements ISortable {

        @Override
        public boolean greater(int a, int b) {
            if (a > b) {
                return true;
            } else {
                return false;
            }
        }
    }

    private class Downward implements ISortable {

        @Override
        public boolean greater(int a, int b) {
            if (a < b) {
                return true;
            } else {
                return false;
            }
        }
    }
}
