package Adapter3;

import java.io.IOException;

/**
 * Created by mafuyuk on 2016/12/04.
 */
public interface FileIO {
    public void readFromFile(String fileName) throws IOException;
    public void writeToFile(String fileName) throws IOException;
    public void setValue(String key, String val);
    public String getValue(String key);
}
