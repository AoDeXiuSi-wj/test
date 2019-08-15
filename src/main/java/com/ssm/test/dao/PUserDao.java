package com.ssm.test.dao;

import com.ssm.test.entity.PUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

public interface PUserDao {
    public PUser findByUsernameAndPwd(@Param("username") String username, @Param("password") String password);
}
