package com.cssweb.omp.idm.service;

import com.cssweb.omp.idm.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void selectAllAccount()
    {
        List<User> users = userService.selectAllUsers();
        for (User user : users)
        {
            System.out.println("user = " + user.getUserName());
        }

    }
}
