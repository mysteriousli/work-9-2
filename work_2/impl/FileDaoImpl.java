package work_9_2.work_2.impl;

import work_9_2.work_2.WFile;

import java.io.*;

public class FileDaoImpl implements FileDao {
    private WFile wFile;
    private File file;
    public FileDaoImpl(WFile wFile){
        this.wFile = wFile;
    }
    @Override
    public void openFile() {
        this.file = new File(wFile.getPath()+wFile.getName());
        if (!this.file.exists()){
            try {
                this.file.createNewFile();
                System.out.println("创建成功并打开该文件！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("打开该文件！");
        }
    }

    @Override
    public boolean closeFile() {

        if (!this.file.exists()){
            System.out.println("该文件不存在!");
            return false;
        }else {
            System.out.println("正在关闭该文件!并销毁该文件！"+this.file.getPath());
            this.file.delete();
            return true;
        }
    }

    @Override
    public boolean writeFile() throws IOException {
        if (!this.file.exists()){
            System.out.println("该文件不存在!");
            return false;
        }else {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.file, true));
            writer.write(this.wFile.getContent());
            writer.flush();
            writer.close();
            System.out.println("文件写入成功！");
        }
        return true;
    }
}
