package work_9_2.work_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import work_9_2.work_2.impl.FileDao;
import work_9_2.work_2.impl.FileDaoImpl;
import work_9_2.work_2.impl.FileServiceDao;
import work_9_2.work_2.impl.FileWriterService;

@Configuration
@ComponentScan
public class WFileConfig {
    @Bean
    public WFile getWFile(){
        WFile wFile = new WFile();
        wFile.setPath("D:\\file\\");
        wFile.setName("MrLi.txt");
        wFile.setContent("啊，美妙的一天！");
        return wFile;
    }

    @Bean
    public FileDao getFile(){
        return new FileDaoImpl(getWFile());
    }

    @Bean
    public FileServiceDao getWriterFile(){
        return new FileWriterService(getFile());
    }

}
