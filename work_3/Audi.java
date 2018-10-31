package work_9_2.work_3;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Audi {
    @AfterReturning("execution(* work_9_2.work_3.UserDao.add(..))")
    public void getFirst(){
        System.out.println("The add()!");
    }
    @AfterReturning("execution(* work_9_2.work_3.UserDao.check(..))")
    public void getSecond(){
        System.out.println("The check()!");
    }
    @AfterReturning("execution(* work_9_2.work_3.UserDao.delete())")
    public void getThird(){
        System.out.println("The delete()!");
    }
    @AfterReturning("execution(* work_9_2.work_3.UserDao.userList())")
    public void getFourth(){
        System.out.println("The userList()!");
    }
    @AfterThrowing(value = "execution(* work_9_2.work_3.UserDao.userList())",throwing = "sh")
    public void getFifth(Exception sh){
        System.out.println(sh.getMessage());
    }
}
