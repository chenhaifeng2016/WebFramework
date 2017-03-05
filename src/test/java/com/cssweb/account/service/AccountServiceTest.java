package com.cssweb.account.service;

import com.cssweb.account.pojo.Account;
import com.cssweb.account.service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void selectAllAccount()
    {
        List<Account> accounts = accountService.selectAll();
        for (Account account : accounts)
        {
            System.out.println("account = " + account.getUserName());
        }

    }
}
