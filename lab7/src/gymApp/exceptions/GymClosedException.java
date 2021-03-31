package gymApp.exceptions;

public class GymClosedException extends RuntimeException{
    public GymClosedException() {
        super("Gym is closed");
    }
}
