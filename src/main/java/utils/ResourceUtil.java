package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ResourceUtil {

    public static Properties props;

    public static void getProps() {
        props= new Properties();
        File file= new File("src/test/resources/application.properties");
        try{
            props.load(new FileInputStream(file));

        }catch(Exception e) {

        }
    }

    public static String getProperty(String key){
        getProps();
        return props.getProperty(key);
    }



}
