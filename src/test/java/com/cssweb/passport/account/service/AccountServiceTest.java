package com.cssweb.passport.account.service;

import com.cssweb.passport.account.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
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
        List<Account> accounts = accountService.selectAllAccounts();
        for (Account account : accounts)
        {
            System.out.println("account = " + account.getUserName());
        }

    }
}
