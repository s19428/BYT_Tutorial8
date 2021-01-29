
public class PersonStringConverter {

	public String convertToString(Person person) {
		return person.getLast() + ", " + person.getFirst()
				+ ((person.getMiddle() == null) ? "" : " " + person.getMiddle());
	}

}
