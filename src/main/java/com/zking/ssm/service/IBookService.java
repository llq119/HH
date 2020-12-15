package com.zking.ssm.service;

import com.zking.ssm.model.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @anthor 小李
 * @ddddddd
 * @company 郴州
 * @create 2020-11-23 21:16
 */
@Transactional
public interface IBookService {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);
    @Transactional(readOnly = true)
    @Cacheable(value = "book")
    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);
    @Cacheable(value = "book")
    Book updateByPrimaryKey(Book record);
    @Transactional(readOnly = true)
    List queryAll(Book record);
}
