package tonhi.com.test;

import java.util.ArrayList;

import tonhi.com.model.Man;
import tonhi.com.model.Person;
import tonhi.com.model.Woman;

public class TestPerson {

	public static void main(String[] args) {
		ArrayList<Person> dsPerson= new ArrayList<Person>();
		Person an= new Man();
		an.setFirstName("AN");
		Person hong = new Woman();
		hong.setFirstName("Hồng");
		((Woman)hong).setWearingMakup(true);
		dsPerson.add(an);
		dsPerson.add(hong);
		for(Person p: dsPerson) {
			if(p instanceof Man) {
				System.out.println(p.getFirstName()+" là nam");
			}
			else if(p instanceof Woman) {
				System.out.println(p.getFirstName()+"là nữ");
			}
		}
		
	}

}
