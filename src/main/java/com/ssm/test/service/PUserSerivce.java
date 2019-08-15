package com.ssm.test.service;

import com.ssm.test.entity.PUser;
import org.springframework.stereotype.Repository;


public interface PUserSerivce {
    public PUser findByUsernameAndPwd(String username, String password);
}
