package com.zking.ssm.service;

import com.zking.ssm.mapper.BookMapper;
import com.zking.ssm.model.Book;
import com.zking.ssm.service.impl.BookServiceImpl;
import com.zking.ssm.util.MybatisSessionFactoryUtils;
import lombok.ToString;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @anthor 小李
 * @ddddddd
 * @company 郴州
 * @create 2020-11-25 11:38
 */
@ToString
public class IBookServiceTest {
    private IBookService iBookService;
    Book book;
    private SqlSession sqlSession;
    @Before
    public void setUp() throws Exception {
        book=new Book();
        //del
        sqlSession = MybatisSessionFactoryUtils.openSession();
        //com.zking.ssm.mapper.BookMapper
        //String name = BookMapper.class.getName();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        BookServiceImpl bookServiceImpl= new BookServiceImpl();
        bookServiceImpl.setBookMapper(bookMapper);
        iBookService = bookServiceImpl;
        //del
    }

    @After
    public void tearDown() throws Exception {
        sqlSession.commit();
    }

    @Test
    public void insert() {
        book.setBookId(null);
        book.setBookName("西游记");
        book.setBookPrice(33f);
        book.setBookBrief("升级打怪");
        iBookService.insert(book);
        System.out.println("OK");
    }

    @Test
    public void queryAll() {
        book.setBookName("西");
        List list = iBookService.queryAll(book);
        list.forEach(l->{
            System.out.println(l);
        });
    }
    @Test
    public void get(){
        Book book = iBookService.selectByPrimaryKey(3);
        System.out.println(book);
        System.out.println("sss");
        Book c = iBookService.selectByPrimaryKey(3);
        System.out.println(c);
        System.out.println("yyyyyy");
    }
    @Test
    public void edit(){
        book.setBookId(4);
        book.setBookName("西游记");
        book.setBookPrice(33f);
        book.setBookBrief("sss");
        iBookService.updateByPrimaryKey(book);
    }
}