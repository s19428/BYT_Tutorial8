
public class QuotedWriter {

	void writeQuoted(String field) {
		System.out.print('\"');
		for (int i = 0; i < field.length(); i++) {
			char c = field.charAt(i);
			if (c == '\"')
				System.out.print("\"\"");
			else
				System.out.print(c);
		}
		System.out.print('\"');
	}

}
