package work_9_2.work_3;

import java.util.List;

public interface UserDao {
    public boolean add();

    public boolean delete();

    public List<User> userList() throws Exception;

    public User check();

}