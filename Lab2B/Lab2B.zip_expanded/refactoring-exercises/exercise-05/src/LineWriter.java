
public class LineWriter {

	void writeLine(CsvWriter csvWriter, String[] fields) {
		if (fields.length == 0)
			System.out.println();
		else {
			csvWriter.writeField(fields[0]);
	
			for (int i = 1; i < fields.length; i++) {
				System.out.print(",");
				csvWriter.writeField(fields[i]);
			}
			System.out.println();
		}
	}

}
