
public class FieldWriter {

	void writeField(CsvWriter csvWriter, String field) {
		if (field.indexOf(',') != -1 || field.indexOf('\"') != -1)
			csvWriter.writeQuoted(field);
		else
			System.out.print(field);
	}

}
