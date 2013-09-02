package weekdays;

public enum Weekdays {

    MON("Monday", "Mon", 1),
    TUE("Tuesday", "Tue", 2),
    WED("Wednesday", "Wed", 3),
    THU("Thursday", "Thu", 4),
    FRI("Friday", "Fri", 5),
    SAT("Saturday", "Sat", 6),
    SUN("Sunday", "Sun", 7);
    private final String titleOfDay;
    private final String titleOfDay2;
    private final int numberOfDay;

    Weekdays(String newTitleOfday, String newTitleOfDay2, int newNumberOfDay) {
        if (newTitleOfDay2 != null && newTitleOfday != null && newNumberOfDay > 0 && newNumberOfDay <= 7) {
            titleOfDay = newTitleOfday;
            titleOfDay2 = newTitleOfDay2;
            numberOfDay = newNumberOfDay;
        } else {
            throw new IllegalArgumentException("Imate nekorektna stoinost");
        }
    }

    public String getTitleOfDay() {
        return titleOfDay;
    }

    public String getTitleOfDay2() {
        return titleOfDay2;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }
}
