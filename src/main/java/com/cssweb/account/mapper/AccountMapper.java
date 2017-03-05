package com.cssweb.account.mapper;

import com.cssweb.account.pojo.Account;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by chenh on 2016/6/25.
 */
@MapperScan
public interface AccountMapper {

    public List<Account> selectAll();
    public Account login(String userName);
}
