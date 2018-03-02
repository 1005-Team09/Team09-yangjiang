package com.team9.controller;


import com.team9.domain.*;
import com.team9.page.PageBean;
import com.team9.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by dllo on 18/2/28.
 */
@Controller
public class TaskController {

    @Resource
    private TaskService taskService;

    @RequestMapping(value = {"/taskInWait"})
    public String taskInWait() {
        return "task/taskInWait";
    }

    @RequestMapping(value = {"/taskFinished"})
    public String taskFinished() {
        return "task/taskFinished";
    }

    @RequestMapping(value = {"/selectStaffWindow"})
    public String selectStaffWindow() {
        return "utils/selectStaffWindow";
    }

    @RequestMapping(value = {"/selectDepWindow"})
    public String selectDepWindow() {
        return "utils/selectDepWindow";
    }

    @RequestMapping(value = {"/selectFacWindow"})
    public String selectFacWindow(){
        return "utils/selectFacWindow";
    }

    @RequestMapping(value = {"/selectComWindow"})
    public String selectComWindow(){ return "utils/selectComWindow"; }

    /**
     * 弹出窗口 查询所有员工
     */
    @RequestMapping(value = {"/selectAllStaff"})
    @ResponseBody
    public BaseResult<StaffParameter> selectAllStaff(String staffName, Integer pageIndex, Integer pageSize) {
        BaseResult<StaffParameter> result = taskService.selectAllStaff(staffName, pageIndex + 1, pageSize);
        return result;
    }

    /**
     * 弹出窗口 查询所有部门
     */
    @RequestMapping(value = {"/selectAllDep"})
    @ResponseBody
    public BaseResult<DepParameter> selectAllDep(String depName, Integer pageIndex, Integer pageSize) {
        BaseResult<DepParameter> result = taskService.selectAllDep(depName, pageIndex + 1, pageSize);
        return result;
    }

    /**
     * 弹出窗口  查询所有厂房
     */
    @RequestMapping(value = {"/selectAllFac"})
    @ResponseBody
    public BaseResult<YjFactory> selectAllFac(String facName,Integer pageIndex, Integer pageSize){
        BaseResult<YjFactory> result = taskService.selectAllFac(facName,pageIndex+1,pageSize);
        return result;
    }

    /**
     * 弹出窗口  查询所有单位
     */

    @RequestMapping(value = {"/selectAllCom"})
    @ResponseBody
    public BaseResult<Yjcompany> selectAllCom(String comName,Integer pageIndex, Integer pageSize){
        BaseResult<Yjcompany> result = taskService.selectAllCom(comName,pageIndex+1,pageSize);
        return result;
    }

    /**
     * 主要逻辑 查询任务
     */
    @RequestMapping(value = {"/selectTask"}, method = RequestMethod.POST)
    @ResponseBody
    public PageBean<YjTaskParameter> selectTask(@RequestBody YjTaskRequestParameter yjTaskRequestParameter) {
        PageBean<YjTaskParameter> pageBean = taskService.selectTask(yjTaskRequestParameter);
        return pageBean;
    }

}
