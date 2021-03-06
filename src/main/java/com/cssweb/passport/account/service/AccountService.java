package com.cssweb.passport.account.service;

import com.cssweb.passport.account.mapper.AccountMapper;
import com.cssweb.passport.account.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chenh on 2016/6/25.
 */
@Service
@Transactional
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    public List<Account> selectAllAccounts()
    {
        return accountMapper.selectAllAccounts();
    }

    public Account login(String userName)
    {
        return accountMapper.login(userName);
    }
}
