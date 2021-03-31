package gymApp.main;

import gymApp.exceptions.GymAccessDeniedException;
import gymApp.model.Member;
import gymApp.service.GymService;

public class GymApp {
    public static void main(String[] args) {
        GymService service = new GymService(100);
        Member member = new Member();
        Object nonMember = new Object();
        try {
            service.bookSeatAtClass(member);
        } catch (GymAccessDeniedException e)    {
            System.out.println(e.getMessage());
        }
    }
}
