package helloworld.kukzee.com;

import java.util.Map;

import utils.kukzee.com.TextIO;

public class Test {
	enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
	public static void main(String[] args) {
		int alphaBet;
		String str;
		
		for (Day d: Day.values()){
		System.out.println(d);
		System.out.println(d.ordinal());
		}
	}
}