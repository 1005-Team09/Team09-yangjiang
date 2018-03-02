package com.team9.mapper;


import com.team9.domain.*;

import java.util.List;

/**
 * Created by dllo on 18/2/27.
 */
public interface TaskDao {

    List<StaffParameter> selectAll(StaffSqlParameter staffSqlParameter);

    Integer selectTotal(String staffName);

    List<YjTaskParameter> selectAll2(YjTaskRequestParameter yjTaskRequestParameter);

    Integer selectTotal2(YjTaskRequestParameter yjTaskRequestParameter);


}
