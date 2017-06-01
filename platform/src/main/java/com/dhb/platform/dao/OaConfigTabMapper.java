package com.dhb.platform.dao;

import com.dhb.platform.entity.OaConfigTab;

public interface OaConfigTabMapper {
    int insert(OaConfigTab record);

    int insertSelective(OaConfigTab record);
}