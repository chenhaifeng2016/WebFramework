package com.cssweb.omp.idm.controller;

import com.cssweb.account.controller.AccountController;
import com.cssweb.omp.idm.pojo.User;
import com.cssweb.omp.idm.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by chenhf on 2015/4/5.
 */
@Controller
public class UserController {

    static final Logger logger = LogManager.getLogger(AccountController.class.getName());
    @Autowired
    UserService userService;

    @RequestMapping(value = "selectAllUser")
    public String selectAll()
    {
        User user = userService.select(1);
        logger.info("select user success");
        return "success";
    }
}
