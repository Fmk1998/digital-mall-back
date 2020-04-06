package com.vue_shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vue_shop.dao.OrdersDao;
import com.vue_shop.entity.Orders;
import com.vue_shop.service.OrdersService;
import org.springframework.stereotype.Service;

/**
 * (Orders)表服务实现类
 *
 * @author makejava
 * @since 2020-04-06 13:03:29
 */
@Service("ordersService")
public class OrdersServiceImpl extends ServiceImpl<OrdersDao, Orders> implements OrdersService {

}