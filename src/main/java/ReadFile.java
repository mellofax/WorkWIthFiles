import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    private String Directory;
    private FileInputStream in = null;

    public ReadFile(String directory) {
        Directory = directory;
    }

    public boolean Read() throws IOException {
        String FileInfo = "";
        in = new FileInputStream(Directory);
        int c;
        while ((c = in.read()) != -1)
        {
            Character d = (char)c;
            FileInfo +=d;
        }
        System.out.println(FileInfo);
        if (in != null)
        {
            in.close();
            return true;
        }
        return false;
    }
}
