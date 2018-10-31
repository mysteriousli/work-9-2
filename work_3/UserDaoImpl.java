package work_9_2.work_3;

import java.util.*;

public class UserDaoImpl implements UserDao{
    @Override
    public boolean add() {
        return true;
    }

    @Override
    public boolean delete() {
        return true;
    }

    @Override
    public List<User> userList() throws Exception {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setAge(18);
        user.setName("小明！");
        users.add(user);
        throw new Exception("获取错误！");
    }

    @Override
    public User check() {
        User user = new User();
        user.setAge(18);
        user.setName("小明！");
        return user;
    }

}
