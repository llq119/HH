package com.zking.ssm.service;

import com.zking.ssm.model.Customer;

import java.util.List;

/**
 * @anthor 小李
 * @ddddddd
 * @company 郴州
 * @create 2020-11-27 18:27
 */
public interface ICustomerService {

    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);
    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    List queryOrderByCust (Customer customer);
}
