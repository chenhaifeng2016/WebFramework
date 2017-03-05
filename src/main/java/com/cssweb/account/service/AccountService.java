package com.cssweb.account.service;

import com.cssweb.account.mapper.AccountMapper;
import com.cssweb.account.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chenh on 2016/6/25.
 */
@Service
@Transactional
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    public List<Account> selectAll()
    {
        return accountMapper.selectAll();
    }

    public Account login(String userName)
    {
        return accountMapper.login(userName);
    }
}
