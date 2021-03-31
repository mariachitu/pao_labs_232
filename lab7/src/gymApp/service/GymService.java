package gymApp.service;

import gymApp.exceptions.GymAccessDeniedException;
import gymApp.exceptions.GymClosedException;
import gymApp.exceptions.GymOvercrowdedexception;
import gymApp.model.Gym;
import gymApp.model.Member;

import java.time.LocalTime;

public class GymService {
    private Gym gym;

    public GymService(int capacity) {
        this.gym = new Gym();
        gym.setTotalSeats(capacity);
    //    gym.setBookedSeats(capacity);
    }

    public void bookSeatAtClass(Object obiect) throws GymAccessDeniedException  {
        if(obiect instanceof Member)    {
            if(LocalTime.now().isAfter(Gym.startTime) && LocalTime.now().isBefore(Gym.endTime))  {
                if(gym.getTotalSeats() - gym.getBookedSeats() > 0)  {
                    gym.setBookedSeats(gym.getTotalSeats() + 1);
                } else {
                    throw new GymOvercrowdedexception();
                }
            } else  {
                throw new GymClosedException();
            }
        } else  {
            throw new GymAccessDeniedException();
        }
    }

}
