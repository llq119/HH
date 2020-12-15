package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.NewsMapper;
import com.zking.ssm.model.News;
import com.zking.ssm.service.INews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @anthor 小李
 * @ddddddd
 * @company 郴州
 * @create 2020-11-27 21:48
 */
@Service
@Scope("prototype")
public class NewsImpl implements INews {
    @Autowired
    private NewsMapper newsMapper;
    @Override
    public int deleteByPrimaryKey(Integer newsId) {
        return newsMapper.deleteByPrimaryKey(newsId);
    }

    @Override
    public int insert(News record) {
        return newsMapper.insert(record);
    }

    @Override
    public int insertSelective(News record) {
        return newsMapper.insertSelective(record);
    }

    @Override
    public News selectByPrimaryKey(Integer newsId) {
        return newsMapper.selectByPrimaryKey(newsId);
    }

    @Override
    public int updateByPrimaryKeySelective(News record) {
        return newsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(News record) {
        return newsMapper.updateByPrimaryKey(record);
    }
}
