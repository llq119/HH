package com.zking.ssm.mapper;

import com.zking.ssm.model.NewsC;

public interface NewsCMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsC record);

    int insertSelective(NewsC record);

    NewsC selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsC record);

    int updateByPrimaryKey(NewsC record);
}