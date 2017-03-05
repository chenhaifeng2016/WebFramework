package com.cssweb.passport.account.mapper;

import com.cssweb.passport.account.pojo.Account;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by chenh on 2016/6/25.
 */
@MapperScan
public interface AccountMapper {

    @Select("select * from Account")
    public List<Account> selectAllAccounts();

    @Select("select * from Account where username=#{userName}")
    public Account login(String userName);
}
