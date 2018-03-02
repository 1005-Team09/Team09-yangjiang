package com.team9.mapper;

import com.team9.domain.ComSqlParameter;
import com.team9.domain.Yjcompany;

import java.util.List;

/**
 * Created by dllo on 18/3/1.
 */

public interface ComDao {
    List<Yjcompany> selectAll(ComSqlParameter comSqlParameter);

    Integer selectTotal(String comName);
}
