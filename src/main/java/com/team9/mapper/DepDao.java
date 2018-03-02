package com.team9.mapper;


import com.team9.domain.DepParameter;
import com.team9.domain.DepSqlParameter;

import java.util.List;

/**
 * Created by dllo on 18/2/27.
 */
public interface DepDao {

    List<DepParameter> selectAll(DepSqlParameter depSqlParameter);

    Integer selectTotal(String depName);

}
