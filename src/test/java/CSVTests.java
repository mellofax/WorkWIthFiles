import org.testng.annotations.Test;

import java.io.IOException;

public class CSVTests {
    @Test
    public void CSVTest() throws IOException {
        CSVReader csv = new CSVReader();
        csv.writeCsvFile();
        csv.readCsv();
    }
}
