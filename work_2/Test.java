package work_9_2.work_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import work_9_2.work_2.impl.FileServiceDao;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
//        WFileConfig wFileConfig = new WFileConfig();
//        FileServiceDao fileDao = wFileConfig.getWriterFile();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
        FileServiceDao fileServiceDao = (FileServiceDao) applicationContext.getBean("service");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        while (true) {
            if (key == 1) {
                fileServiceDao.writerFile();
            }else if (key ==2){
                fileServiceDao.closeFile();
            }else {
                break;
            }
            key = scanner.nextInt();
        }
        System.out.println("结束！");
    }
}
