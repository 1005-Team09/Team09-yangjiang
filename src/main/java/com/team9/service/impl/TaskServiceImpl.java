package com.team9.service.impl;


import com.team9.domain.*;
import com.team9.mapper.ComDao;
import com.team9.mapper.DepDao;
import com.team9.mapper.FacDao;
import com.team9.mapper.TaskDao;
import com.team9.page.PageBean;
import com.team9.service.TaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 18/2/27.
 */
@Service(value = "taskService")
public class TaskServiceImpl implements TaskService {

    @Resource
    private TaskDao taskDao;
    @Resource
    private DepDao depDao;

    @Resource
    private FacDao facDao;

    @Resource
    private ComDao comDao;

    @Override
    public BaseResult<StaffParameter> selectAllStaff(String staffName, int pageIndex, int pageSize) {
        BaseResult<StaffParameter> result = new BaseResult<>();
        StaffSqlParameter staffSqlParameter = new StaffSqlParameter();

        String staffName88 = staffName;
        if (staffName == null || staffName.equals("")) {
            staffName88 = null;
        }
        int total = taskDao.selectTotal(staffName88);

        if (total == 0) {
            return null;
        }

        PageBean<StaffParameter> pageBean = new PageBean<>(pageIndex, pageSize, total);

        staffSqlParameter.setStaffName(staffName88);
        staffSqlParameter.setPageIndex(pageBean.getStartIndex());
        staffSqlParameter.setPageSize(pageBean.getPageSize());

        List<StaffParameter> datas = taskDao.selectAll(staffSqlParameter);
        result.setTotal(total);
        result.setData(datas);
        return result;
    }

    @Override
    public BaseResult<DepParameter> selectAllDep(String depName, int pageIndex, int pageSize) {
        BaseResult<DepParameter> result = new BaseResult<>();
        DepSqlParameter depSqlParameter = new DepSqlParameter();

        String depName88 = depName;
        if (depName == null || depName.equals("")) {
            depName88 = null;
        }
        int total = depDao.selectTotal(depName88);

        if (total == 0) {
            return null;
        }

        PageBean<DepParameter> pageBean = new PageBean<>(pageIndex, pageSize, total);

        depSqlParameter.setDepName(depName88);
        depSqlParameter.setPageIndex(pageBean.getStartIndex());
        depSqlParameter.setPageSize(pageBean.getPageSize());

        List<DepParameter> datas = depDao.selectAll(depSqlParameter);

        result.setTotal(total);
        result.setData(datas);
        return result;
    }

    @Override
    public BaseResult<YjFactory> selectAllFac(String facName, int pageIndex, int pageSize) {
        BaseResult<YjFactory> result = new BaseResult<>();
        FacSqlParameter facSqlParameter = new FacSqlParameter();

        String facName88 = facName;
        if (facName == null || facName.equals("")) {
            facName88 = null;
        }
        int total = facDao.selectTotal(facName88);

        if (total == 0) {
            return null;
        }

        PageBean<YjFactory> pageBean = new PageBean<>(pageIndex, pageSize, total);

        facSqlParameter.setFacName(facName88);
        facSqlParameter.setPageIndex(pageBean.getStartIndex());
        facSqlParameter.setPageSize(pageBean.getPageSize());

        List<YjFactory> datas = facDao.selectAll(facSqlParameter);
        result.setTotal(total);
        result.setData(datas);
        return result;
    }

    @Override
    public BaseResult<Yjcompany> selectAllCom(String comName, int pageIndex, int pageSize) {
        BaseResult<Yjcompany> result = new BaseResult<>();
        ComSqlParameter comSqlParameter = new ComSqlParameter();

        String comName88 = comName;
        if (comName == null || comName.equals("")) {
            comName = null;
        }
        int total = facDao.selectTotal(comName);

        if (total == 0) {
            return null;
        }

        PageBean<Yjcompany> pageBean = new PageBean<>(pageIndex, pageSize, total);

        comSqlParameter.setComName(comName88);
        comSqlParameter.setPageIndex(pageBean.getStartIndex());
        comSqlParameter.setPageSize(pageBean.getPageSize());

        List<Yjcompany> datas = comDao.selectAll(comSqlParameter);
        result.setTotal(total);
        result.setData(datas);
        return result;
    }

    @Override
    public PageBean<YjTaskParameter> selectTask(YjTaskRequestParameter yjTaskRequestParameter) {
        // miniui框架 首页返回0 要加1 没用框架就不加
        int pageIndex = yjTaskRequestParameter.getPageIndex();
        int pageSize = yjTaskRequestParameter.getPageSize();
        // 仅用到后四个参数进行总数量查询
        int total = taskDao.selectTotal2(yjTaskRequestParameter);
        // 获取分页页码数据
        PageBean<YjTaskParameter> pageBean = new PageBean<>(pageIndex, pageSize, total);
        // 没有数据返回空pagebean
        if(total==0){
            return pageBean;
        }
        // 暂存一下 用于分页查询参数
        yjTaskRequestParameter.setPageIndex(pageBean.getStartIndex());
        // 获取结果集数组
        List<YjTaskParameter> beanList = taskDao.selectAll2(yjTaskRequestParameter);
        // 结果集打包
        pageBean.setBeanList(beanList);
        return pageBean;
    }
}
