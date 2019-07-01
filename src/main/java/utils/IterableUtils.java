package utils;

import java.util.ArrayList;
import java.util.function.Function;


public class IterableUtils{
	public static <T> Function<Iterable<T>,Iterable<T>> filterBy(Function<T,Boolean> predicate){
		return (Iterable<T> attendees) -> {
			ArrayList<T> filtered = new ArrayList<T>();
			for(T attendee: attendees) {
				if(predicate.apply(attendee)) filtered.add(attendee);
			}
			return filtered;
		};
	}

}
