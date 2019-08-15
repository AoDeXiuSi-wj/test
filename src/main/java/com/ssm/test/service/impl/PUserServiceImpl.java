package com.ssm.test.service.impl;

import com.ssm.test.dao.PUserDao;
import com.ssm.test.entity.PUser;
import com.ssm.test.service.PUserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("PUserSerivce")
public class PUserServiceImpl implements PUserSerivce{
    @Autowired
    private PUserDao pUserDao;
    public PUser findByUsernameAndPwd(String username, String password) {
        return pUserDao.findByUsernameAndPwd(username,password);
    }
}
