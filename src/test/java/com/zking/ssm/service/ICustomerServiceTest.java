package com.zking.ssm.service;

import com.zking.ssm.model.Customer;
import com.zking.ssm.model.Order;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @anthor 小李
 * @ddddddd
 * @company 郴州
 * @create 2020-11-27 19:28
 */
public class ICustomerServiceTest extends BaseTestCast {
@Autowired
    private  ICustomerService customerService;
private Customer customer;
    @Before
    public void setUp() throws Exception {
        customer=new Customer();
    }

    @Test
    public void insert() {
        customer.setCustomerId(null);
        customer.setCustomerName("kk");
        customerService.insert(customer);
    }


    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
        Customer c= customerService.selectByPrimaryKey(5);
        System.out.println(c);
    }

    @Test
    public void queryOrderByCust() {
        customer.setCustomerId(2);
        List<Customer> lst=customerService.queryOrderByCust(customer);
        lst.forEach(c->{
            System.out.println(c.getOrders());
            List<Order> list=c.getOrders();
            list.forEach(o->{
                System.out.println(o);
            });
        });
    }
}