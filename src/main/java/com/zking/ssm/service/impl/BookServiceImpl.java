package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.BookMapper;
import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @anthor 小李
 * @ddddddd
 * @company 郴州
 * @create 2020-11-23 21:21
 */
//@Component
    @Service(value = "book")
@ToString
public class BookServiceImpl implements IBookService {

@Autowired
private BookMapper bookMapper;


    @Override
    public int deleteByPrimaryKey(Integer bookId) {
        return bookMapper.deleteByPrimaryKey(bookId);
    }

    @Override
    public int insert(Book record) {
        bookMapper.insert(record);
        return 0;
    }


    @Override
    public int insertSelective(Book record) {
        return bookMapper.insertSelective(record);
    }

    @Override
    public Book selectByPrimaryKey(Integer bookId) {
        return bookMapper.selectByPrimaryKey(bookId);
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return bookMapper.updateByPrimaryKey(record);
    }

    @Override
    public Book updateByPrimaryKey(Book record) {
        bookMapper.updateByPrimaryKey(record);
        return record;
    }

    @Override
    public List queryAll(Book record) {
        return bookMapper.queryAll(record);
    }

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
}
