package ir.ac.kntu;

public class Time {

    private int hour;
    private int minute;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Time() {
    }

    @Override
    public String toString() {
        return
                " hour:" + hour +
                ", minute:" + minute;
    }
}
