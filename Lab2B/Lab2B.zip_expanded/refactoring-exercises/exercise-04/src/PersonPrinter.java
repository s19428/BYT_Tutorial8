import java.io.IOException;
import java.io.Writer;

public class PersonPrinter {

	public void printPerson(Person person, Writer out) throws IOException {
		out.write(person.getFirst());
		out.write(" ");
		if (person.getMiddle() != null) {
			out.write(person.getMiddle());
			out.write(" ");
		}
		out.write(person.getLast());
	}

}
