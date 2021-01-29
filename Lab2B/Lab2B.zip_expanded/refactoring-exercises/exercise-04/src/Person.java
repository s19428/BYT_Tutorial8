import java.io.IOException;
import java.io.Writer;

public class Person {
	private String last;

	private String first;

	private String middle;
	
	private PersonDisplayer displayer = new PersonDisplayer();
	private PersonStringConverter stringConverter = new PersonStringConverter();
	private PersonFormat personFromat = new PersonFormat();
	private PersonPrinter personPrinter = new PersonPrinter();

	public Person(String last, String first, String middle) {
		this.setLast(last);
		this.setFirst(first);
		this.setMiddle(middle);
	}


	public void display(Writer out) throws IOException {
		displayer.display(this, out);
	}

	public String convertToString() {
		return stringConverter.convertToString(this);
	}

	public String formatPerson() {
		return personFromat.formatPerson(this);
	}

	public void printPerson(Writer out) throws IOException {
		personPrinter.printPerson(this, out);
	}

	public String getMiddle() {
		return middle;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}
}