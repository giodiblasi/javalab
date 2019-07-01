package functional.templatemethod;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class InvitationManager {
	
	public void Invite(Supplier<Iterable<Attendee>> getAttendees,
					   Function<Iterable<Attendee>,Iterable<Attendee>> chooseAttendees,
					   Consumer<Attendee> sendInvitation) {
		
		chooseAttendees
			.apply(getAttendees.get())
			.forEach((attendee) -> sendInvitation.accept(attendee));
		
	}

}
