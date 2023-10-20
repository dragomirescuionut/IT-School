package session15.enums;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESAY(true);

    private boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public boolean isWeekday() {
        return isWeekday;
    }
}