import java.io.IOException;
import java.io.Writer;

public class PersonDisplayer {

	public void display(Person person, Writer out) throws IOException {
		out.write(person.getLast());
		out.write(", ");
		out.write(person.getFirst());
		if (person.getMiddle() != null) {
			out.write(" ");
			out.write(person.getMiddle());
		}
	}

}
