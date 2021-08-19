import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
    private String Directory;
    private FileOutputStream out = null;

    public CreateFile(String directory) {
        Directory = directory;
    }

    public boolean CreateNewFile() throws IOException {
        out = new FileOutputStream(Directory);
        if (out != null)
        {
            out.close();
            return true;
        }
        return false;
    }
}
