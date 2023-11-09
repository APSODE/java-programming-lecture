package Assignment4.C;

import java.util.Calendar;

public class Program {
    private String name;
    private Calendar startTime;
    private Calendar endTime;

    public Program(String name) {
        this.name = name;
        this.startTime = Calendar.getInstance();
        this.endTime = Calendar.getInstance();
        this.endTime.add(Calendar.HOUR, 1);
    }

    public static Program createProgram(String name) {
        return new Program(name);
    }

    public String getName() {
        return this.name;
    }

    public Calendar getStartTime() {
        return this.startTime;
    }

    public Calendar getEndTime() {
        return this.endTime;
    }

    public boolean isOnAir(Calendar currentTime) {
        boolean startTimeCheck = this.startTime.compareTo(currentTime) >= 0;
        boolean endTimeCheck = this.endTime.compareTo(currentTime) <= 0;

        return startTimeCheck && endTimeCheck;
    }
}
