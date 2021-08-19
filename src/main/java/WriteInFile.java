import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInFile {
    private String Directory;
    private FileOutputStream out = null;
    private FileInputStream in = null;

    public WriteInFile(String directory) {
        Directory = directory;
    }
    public void Write(String Text) throws IOException {
        out = new FileOutputStream(Directory);
        for (int i = 0; i < Text.length(); i++) {
            char c = Text.charAt(i);
            out.write((int)c);
        }
    }
    public String Read() throws IOException {
        String FileInfo = "";
        in = new FileInputStream(Directory);
        int c;
        while ((c = in.read()) != -1)
        {
            Character d = (char)c;
            FileInfo +=d;
        }
        if (in != null)
        {
            in.close();
            return FileInfo;
        }
        return "";
    }
}
