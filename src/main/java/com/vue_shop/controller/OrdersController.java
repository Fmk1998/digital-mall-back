package com.vue_shop.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.vue_shop.entity.Orders;
import com.vue_shop.entity.Result;
import com.vue_shop.service.OrdersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Orders)表控制层
 *
 * @author makejava
 * @since 2020-04-06 13:03:29
 */
@RestController
@RequestMapping("orders")
public class OrdersController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private OrdersService ordersService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param orders 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Orders> page, Orders orders) {
        return success(this.ordersService.page(page, new QueryWrapper<>(orders)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.ordersService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param orders 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Orders orders) {
        return success(this.ordersService.save(orders));
    }

    /**
     * 修改数据
     *
     * @param orders 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Orders orders) {
        return success(this.ordersService.updateById(orders));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.ordersService.removeByIds(idList));
    }

    /**
     * 查询购物车
     *
     * @param uid 参数封装
     * @return Result
     */
    @GetMapping(value = "/cart")
    public R login(Page<Orders> page,@RequestParam("uid") Integer uid,@RequestParam("ordered") Integer ordered) {
        //使用mybatis-plus的Iservice中的方法getOne
        QueryWrapper<Orders> wrapper = new QueryWrapper<Orders>();
        wrapper.eq("uid", uid);
        wrapper.eq("ordered", ordered);
        return success(this.ordersService.pageMaps(page,wrapper));
    }
    /**
     * 查询orders是否存在
     *
     * @param orders 参数封装
     * @return Result
     */
    @PostMapping(value = "/addcart")
    public Orders register(@RequestBody Orders orders) {
        //使用mybatis-plus的Iservice中的方法getOne
        QueryWrapper<Orders> wrapper = new QueryWrapper<Orders>();
        wrapper.eq("pid", orders.getPid());
        return this.ordersService.getOne(wrapper);
    }
}