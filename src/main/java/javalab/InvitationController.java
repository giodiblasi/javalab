package javalab;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import functional.templatemethod.AttendeeRepository;
import functional.templatemethod.InvitationManager;
import utils.IterableUtils;

@Controller
public class InvitationController {

	private InvitationManager manager = new InvitationManager();
	private AttendeeRepository repo = new AttendeeRepository();
	
	@GetMapping("/attendees")
    public String attendees(Model model) {
    	
    	model.addAttribute("attendees", repo.GetAll());
        return "attendees";
    }
	
    @GetMapping("/musicians")
    public String musicians(Model model) {
    	ArrayList<String> messages = new ArrayList<String>();
    	
    	manager.Invite(
    			 repo::GetAll,
    			 IterableUtils.filterBy(attendee -> attendee.getTags().contains("Musician")),
    			 attendee -> messages.add("sent mail to "+ attendee.getName()));
    	
    	
    	model.addAttribute("msgs", messages);
        return "invitation";
    }
    
    @GetMapping("/chefs")
    public String chefs(Model model) {
    	ArrayList<String> messages = new ArrayList<String>();
    	
    	manager.Invite(
    			 repo::GetAll,
    			 IterableUtils.filterBy(attendee -> attendee.getTags().contains("Chef")),
    			 attendee -> messages.add("sent SMS to "+ attendee.getName()));
    	
    	
    	model.addAttribute("msgs", messages);
        return "invitation";
    }

}
