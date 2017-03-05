package com.cssweb.account.controller;

import com.cssweb.account.pojo.Account;
import com.cssweb.account.service.AccountService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by chenh on 2016/6/25.
 */
@Controller
public class AccountController {
    static final Logger logger = LogManager.getLogger(AccountController.class.getName());
    @Autowired
    AccountService accountService;

    @RequestMapping(value = "selectAllAccount")
    public String selectAll()
    {
        List<Account> accounts = accountService.selectAll();

        logger.info("select account success");
        return "success";
    }

    //RESTful API
    @RequestMapping("/account/{id}")
    public @ResponseBody Account login(@PathVariable("id") String userName)
    {
        Account account = accountService.login(userName);
        return account;
    }
}
