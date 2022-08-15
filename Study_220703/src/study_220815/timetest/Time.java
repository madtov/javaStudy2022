package study_220815.timetest;

public class Time {
    public int hour;
    private int minute;
    private int second;

    Time (int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() { return hour; }
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }
    public int getMinute() { return minute; }
    public void setMinute (int minute) {
        if (minute < 0 || minute > 59) return;
        this.second = second;
        }
    public int getSecond() { return second;}
    public void setSecond (int second) {
        if (second < 0 || second > 59) return;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
