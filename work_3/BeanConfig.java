package work_9_2.work_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class BeanConfig {
    @Bean("audi")
    public Audi audi(){
        return new Audi();
    }
    @Bean("userService")
    public UserServiceDao getUserService(){
        return new UserServiceImpl(getUserDao());
    }

    @Bean("userDao")
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }

    @Bean("user")
    public User user(){
        return new User();
    }
}
