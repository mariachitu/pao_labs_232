package gymApp.model;

import java.time.LocalTime;

public class Gym {
    private int totalSeats;
    private int bookedSeats;
    public static final LocalTime startTime = LocalTime.of(8, 0);
    public static final LocalTime endTime = LocalTime.of(22, 0);

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        if(totalSeats < 0)  {
            throw new IllegalArgumentException();
        }
        this.totalSeats = totalSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}
