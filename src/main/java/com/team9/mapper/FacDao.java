package com.team9.mapper;

import com.team9.domain.FacSqlParameter;
import com.team9.domain.YjFactory;

import java.util.List;

/**
 * Created by dllo on 18/3/1.
 */

public interface FacDao {

    List<YjFactory> selectAll(FacSqlParameter facSqlParameter);

    Integer selectTotal(String facName);
}
