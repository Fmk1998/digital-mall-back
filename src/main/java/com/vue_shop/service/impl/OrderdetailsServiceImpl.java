package com.vue_shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vue_shop.dao.OrderdetailsDao;
import com.vue_shop.entity.Orderdetails;
import com.vue_shop.service.OrderdetailsService;
import org.springframework.stereotype.Service;

/**
 * (Orderdetails)表服务实现类
 *
 * @author makejava
 * @since 2020-04-20 10:52:44
 */
@Service("orderdetailsService")
public class OrderdetailsServiceImpl extends ServiceImpl<OrderdetailsDao, Orderdetails> implements OrderdetailsService {

}