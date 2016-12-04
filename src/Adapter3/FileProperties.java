package Adapter3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Properties;

/**
 * Created by mafuyuk on 2016/12/04.
 */
public class FileProperties extends Properties implements FileIO {
    HashMap<String,String> map;

    public FileProperties() {
        this.map = new HashMap<String, String>();
    }

    public void readFromFile(String fileName) throws IOException {
        load(new FileInputStream(fileName));
    }

    public void writeToFile(String fileName) throws IOException {
        store(new FileOutputStream(fileName), "Written by FileProperties");
    }

    public void setValue(String key, String val) {
        setProperty(key, val);
    }

    public String getValue(String key) {
        return getProperty(key, "");
    }
}
