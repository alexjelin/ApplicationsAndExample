package recursiveselectionsort;

public class Box implements Comparable<T> {

    private int volume;

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int val) {
        this.volume = volume;
    }

    public int compareTo(Box o) {
        return this.volume - o.volume;
    }
}
