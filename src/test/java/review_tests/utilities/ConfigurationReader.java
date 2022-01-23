package review_tests.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties; //declare a variable
    //static blocks: it initiates every time i call class name

    static {

        String path="Configuration.properties";

        try {
            properties=new Properties();//created properties object
            FileInputStream file=new FileInputStream(path); //throw java io exeption, checked exception
            properties.load(file);
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String get(String keyName){
        return properties.getProperty(keyName);
    }


}
