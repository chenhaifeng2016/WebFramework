package com.cssweb.omp.idm.mapper;


import com.cssweb.omp.idm.pojo.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenh on 2016/6/25.
 */
@MapperScan
public interface UserMapper {
    public List<User> selectAll();
    public User select(long id);
}
