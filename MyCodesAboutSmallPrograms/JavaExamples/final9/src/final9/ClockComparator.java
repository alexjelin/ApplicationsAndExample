package final9;

import java.util.Comparator;

public class ClockComparator implements Comparator<Clock> {

    @Override
    public int compare(Clock o1, Clock o2) {
        if (o1.getHour() > o2.getHour()) {
            return -1;
        }
        if (o1.getHour() < o2.getHour()) {
            return 1;
        } else {
            if (o1.getMinute() > o2.getMinute()) {
                return -1;
            }
            if (o1.getMinute() < o2.getMinute()) {
                return 1;
            } else {
                if (o1.getSec() > o2.getSec()) {
                    return -1;
                }
                if (o1.getSec() < o2.getSec()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}
