package com.ssm.test.service;

import com.ssm.test.entity.PUser;

public interface PUserSerivce {
    public PUser findByUsernameAndPwd(String username, String password);
}
