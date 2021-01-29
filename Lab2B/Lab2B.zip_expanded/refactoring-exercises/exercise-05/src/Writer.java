
public class Writer {

	public void write(CsvWriter csvWriter, String[][] lines) {
		for (int i = 0; i < lines.length; i++)
			csvWriter.writeLine(lines[i]);
	}

}
