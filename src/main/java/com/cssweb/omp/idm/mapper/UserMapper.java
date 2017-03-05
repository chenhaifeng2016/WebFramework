package com.cssweb.omp.idm.mapper;


import com.cssweb.omp.idm.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenh on 2016/6/25.
 */
@MapperScan
//@Repository
public interface UserMapper {
    @Select("SELECT * FROM TUser")
    public List<User> selectAllUsers();


    @Select("select * from TUser where UserID=#{id}")
    public User select(long id);
}
