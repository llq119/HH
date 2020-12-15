package com.zking.ssm.controller;

import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * @anthor 小李
 * @ddddddd
 * @company 郴州
 * @create 2020-11-30 19:14
 */
@Controller
@RequestMapping("/book")
public class HelloController {
    @Autowired
    private IBookService iBookService;
    @ModelAttribute
    public void getBook(Model model){
        Book book = iBookService.selectByPrimaryKey(3);
        model.addAttribute("book",book);
    }
    @RequestMapping("/hello")
    public  String hello(){
        System.out.println("Hello1  World");
        return "Login";

    }


    @RequestMapping("/toTop")
    public String login(){
        System.out.println(11111);
        return "Top";
    }
@RequestMapping("/{language}")
    public String change(@PathVariable String language, HttpSession session, HttpServletRequest request){
        if("zh".equals(language)){
    session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        }else if("en".equals(language)) {
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);
        }else{
    throw new RuntimeException("不支持的语言["+ language + "]");
    }
return "Top";
    }
}

