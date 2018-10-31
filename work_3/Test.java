package work_9_2.work_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import work_8_4.service.UserService;


public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext c = new AnnotationConfigApplicationContext(BeanConfig.class);
        UserServiceDao userServiceDao = (UserServiceDao) c.getBean("userService");
        userServiceDao.delete();
        userServiceDao.add();
        userServiceDao.check();
        userServiceDao.userList();
    }
}
