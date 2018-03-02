package com.team9.service.impl;


import com.team9.domain.YjStaff;
import com.team9.mapper.LoginDao;
import com.team9.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/27.
 */
@Service(value = "loginService")
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginDao loginDao;

    @Override
    public YjStaff login(YjStaff yjStaff) {

        List<YjStaff> yjStaffList = loginDao.login(yjStaff);

        if (yjStaffList != null && yjStaffList.size() > 0) {
            return yjStaffList.get(0);
        }

        return null;
    }
}
