package com.dhb.platform.dao;

import com.dhb.platform.entity.OaConfigTab;
import com.dhb.platform.entity.OaConfigTabExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OaConfigTabMapper {
    long countByExample(OaConfigTabExample example);

    int deleteByExample(OaConfigTabExample example);

    int insert(OaConfigTab record);

    int insertSelective(OaConfigTab record);

    List<OaConfigTab> selectByExample(OaConfigTabExample example);

    int updateByExampleSelective(@Param("record") OaConfigTab record, @Param("example") OaConfigTabExample example);

    int updateByExample(@Param("record") OaConfigTab record, @Param("example") OaConfigTabExample example);
}