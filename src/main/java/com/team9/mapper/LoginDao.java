package com.team9.mapper;

import com.team9.domain.YjStaff;

import java.util.List;

/**
 * Created by dllo on 18/2/27.
 */

public interface LoginDao {
    List<YjStaff> login(YjStaff yjStaff);
}
