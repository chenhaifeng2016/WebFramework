package com.cssweb.omp.idm.service;



import com.cssweb.omp.idm.mapper.UserMapper;
import com.cssweb.omp.idm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserService{

    @Autowired
    UserMapper userMapper;

    public List<User> selectAllUsers()
    {
        return userMapper.selectAllUsers();
    }

    public User select(long id)
    {
        return userMapper.select(id);
    }
    /*
    判断用户是否已存在
     */
    public boolean isUserExist(String userName)
    {
        return false;
    }

    /*
    注册用户
     */
    public boolean registerUser(User user)
    {
        return false;
    }

    /*
    用户登录
     */
    public User login(String userName, String password)
    {
        return null;
        //return userDao.login(userName, password);
    }
}
