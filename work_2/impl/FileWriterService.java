package work_9_2.work_2.impl;


import java.io.IOException;

public class FileWriterService implements FileServiceDao{
    private FileDao fileDao;
    public FileWriterService(FileDao fileDao){
        this.fileDao = fileDao;
        this.fileDao.openFile();
    }

    @Override
    public void writerFile() throws IOException {
        this.fileDao.writeFile();
    }

    @Override
    public void closeFile() {
        this.fileDao.closeFile();
    }
}
