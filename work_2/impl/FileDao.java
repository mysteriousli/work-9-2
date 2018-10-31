package work_9_2.work_2.impl;

import java.io.IOException;

public interface FileDao {
    public void openFile();
    public boolean closeFile();
    public boolean writeFile() throws IOException;
}