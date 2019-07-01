package functional.templatemethod;

import java.util.ArrayList;

public class Attendee {
  private String name;
  private int Age;
  private ArrayList<String> tags;
  
  public String getName() {
	return name;
  }
  
  public void setName(String name) {
	  this.name = name;
  }
  
  public int getAge() {
	return Age;
  }
  
  public void setAge(int age) {
	Age = age;
  }
  
  public ArrayList<String> getTags() {
	  return tags;
  }
  
  public void setTags(ArrayList<String> tags) {
	  this.tags = tags;
  }
  
  public Attendee(String name, int age, ArrayList<String> tags) {
	  setName(name);
	  setAge(age);
	  setTags(tags);
  }

}
