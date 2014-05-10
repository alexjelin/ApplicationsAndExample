package treeimplementationexample;

public class Car implements Comparable<Car> {

    private int year;

    public Car(int year) throws IllegalAccessException {
        setYear(year);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws IllegalAccessException {
        if (year > 0) {
            this.year = year;
        } else {
            throw new IllegalAccessException("aaa grymnah");
        }
    }

    @Override
    public int compareTo(Car o) {
        if (o == null) {
            return 0;
        } else {
            if (this.year > o.year) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
