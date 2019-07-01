package functional.templatemethod;

import java.util.ArrayList;
import java.util.Arrays;



public class AttendeeRepository {
	public Iterable<Attendee> GetAll(){
		return Arrays.asList(
				new Attendee("John", 35, new ArrayList<String>(Arrays.asList("Developer", "Musician"))),
				new Attendee("Sarah", 31, new ArrayList<String>(Arrays.asList("Copywriter", "Chef"))),
				new Attendee("Mark", 53, new ArrayList<String>(Arrays.asList("Copywriter", "Musician"))),
				new Attendee("Erika", 43, new ArrayList<String>(Arrays.asList("Developer", "Chef"))));
	}
}
