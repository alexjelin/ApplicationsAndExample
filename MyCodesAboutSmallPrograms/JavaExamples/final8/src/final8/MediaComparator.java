package final8;

import java.util.Comparator;

public class MediaComparator implements Comparator<Media> {

    @Override
    public int compare(Media o1, Media o2) {
        if (o1.compareTo(o2) < 0) {
            return 1;
        } else if (o1.compareTo(o2) > 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
