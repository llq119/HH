package com.zking.ssm.mapper;

import com.zking.ssm.model.Book;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;
@CacheConfig
public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);
//    @Cacheable(value = "book")
    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);
    @Cacheable(value = "book")
    int updateByPrimaryKey(Book record);

    List queryAll(Book record);
}