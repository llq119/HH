package com.zking.ssm.service;

import com.zking.ssm.model.News;

/**
 * @anthor 小李
 * @ddddddd
 * @company 郴州
 * @create 2020-11-27 21:47
 */
public interface INews {
    int deleteByPrimaryKey(Integer newsId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}
