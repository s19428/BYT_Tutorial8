public class CsvWriter {
	public CsvWriter() {
	}

	private Writer writer = new Writer();
	private LineWriter lineWriter = new LineWriter();
	private FieldWriter fieldWriter = new FieldWriter();
	private QuotedWriter quotedWriter = new QuotedWriter();
	
	public void write(String[][] lines) {
		writer.write(this, lines);
	}

	void writeLine(String[] fields) {
		lineWriter.writeLine(this, fields);
	}

	void writeField(String field) {
		fieldWriter.writeField(this, field);
	}

	void writeQuoted(String field) {
		quotedWriter.writeQuoted(field);
	}
}