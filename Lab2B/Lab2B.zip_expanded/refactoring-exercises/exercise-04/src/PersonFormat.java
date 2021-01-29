
public class PersonFormat {

	public String formatPerson(Person person) {
		String result = person.getLast() + ", " + person.getFirst();
		if (person.getMiddle() != null)
			result += " " + person.getMiddle();
		return result;
	}

}
