package cn.service.impl;

import cn.dao.impl.UserDaoImpl;
import cn.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDaoImpl userDao;

    public void setUserDao(UserDaoImpl userDaoImpl) {
        this.userDao = userDaoImpl;
    }

    public void save() {
        userDao.go();
    }
}
