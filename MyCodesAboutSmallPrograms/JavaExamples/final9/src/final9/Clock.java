package final9;

public class Clock {

    private int sec;
    private int minute;
    private int hour;

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) throws IllegalAccessException {
        if (sec >= 0 && sec <= 60) {
            this.sec = sec;
        } else {
            throw new IllegalAccessException("BUM >.<!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) throws IllegalAccessException {
        if (minute >= 0 && minute < 61) {
            this.minute = minute;
        } else {
            throw new IllegalAccessException("BUM >.<!");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) throws IllegalAccessException {
        if (hour > 0 && hour <= 24) {
            this.hour = hour;
        } else {
            throw new IllegalAccessException("BUM >.<!");
        }
    }

    public Clock(int hour, int minutes, int seconds) throws IllegalAccessException {
        setHour(hour);
        setMinute(minutes);
        setSec(seconds);
    }

    @Override
    public String toString() {
        return String.format("%d : %d : %d ", getHour(), getMinute(), getSec());
    }
}
