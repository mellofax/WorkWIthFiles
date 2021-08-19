import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileTests {
    @Test
    public void TestCreate() throws IOException {
        CreateFile createFile = new CreateFile("src/main/resources/output.txt");
        Assert.assertEquals(createFile.CreateNewFile(), true, "File was not created");
    }
    @Test
    public void TestRead() throws IOException {
        ReadFile readFile = new ReadFile("src/main/resources/input.txt");
        Assert.assertEquals(readFile.Read(), true, "File was not read");
    }
    @Test
    public void TestWrite() throws IOException {
        String text = "Write this!";
        WriteInFile write = new WriteInFile("src/main/resources/output.txt");
        write.Write(text);
        Assert.assertEquals(write.Read(),text, "Text does not match");
    }
    @Test
    public void TestDelete() throws IOException {
        Files.delete(Path.of("src/main/resources/output.txt"));
    }
}
