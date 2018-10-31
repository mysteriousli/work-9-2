package work_9_2.work_3;

public class UserServiceImpl implements UserServiceDao{
    UserDao  userDao;
    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public void add() {
        System.out.println("添加成功！");
        userDao.add();
    }

    @Override
    public void delete() {
        System.out.println("删除成功！");
        userDao.delete();
    }

    @Override
    public void userList() throws Exception {
        System.out.println("无用户数据！");
        userDao.userList();
    }

    @Override
    public void check() {
        System.out.println("查询不到该用户！");
        userDao.check();
    }

}
