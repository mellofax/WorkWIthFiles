import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class PropertyManager {
    private String propertyFilePath;
    private Properties prop;

    public PropertyManager() {
        propertyFilePath = System.getProperty("user.dir") + "/src/test/resources/instagram.properties";
        loadData();
    }

    private void loadData() {
        prop = new Properties();
        try {
            prop.load(new FileInputStream(propertyFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String get(String propertyName) {
        return prop.getProperty(propertyName);
    }

    public List<String> getList(String propertyName) {
        return Arrays.asList(prop.getProperty(propertyName).split("\\s*,\\s*"));
    }
}
