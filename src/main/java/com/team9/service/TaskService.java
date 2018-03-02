package com.team9.service;


import com.team9.domain.*;
import com.team9.page.PageBean;
/**
 * Created by dllo on 18/2/27.
 */
public interface TaskService {

    BaseResult<StaffParameter> selectAllStaff(String staffName, int pageIndex, int pageSize);

    BaseResult<DepParameter> selectAllDep(String depName, int pageIndex, int pageSize);

    BaseResult<YjFactory> selectAllFac(String facName, int pageIndex, int pageSize);

    BaseResult<Yjcompany> selectAllCom(String comName, int pageIndex, int pageSize);

    PageBean<YjTaskParameter> selectTask(YjTaskRequestParameter yjTaskRequestParameter);
}
