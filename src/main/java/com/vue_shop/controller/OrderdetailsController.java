package com.vue_shop.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.vue_shop.entity.Orderdetails;
import com.vue_shop.service.OrderdetailsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Orderdetails)表控制层
 *
 * @author makejava
 * @since 2020-04-20 10:52:44
 */
@RestController
@RequestMapping("orderdetails")
public class OrderdetailsController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private OrderdetailsService orderdetailsService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param orderdetails 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Orderdetails> page, Orderdetails orderdetails) {
        return success(this.orderdetailsService.page(page, new QueryWrapper<>(orderdetails)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.orderdetailsService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param orderdetails 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Orderdetails orderdetails) {
        return success(this.orderdetailsService.save(orderdetails));
    }

    /**
     * 修改数据
     *
     * @param orderdetails 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Orderdetails orderdetails) {
        return success(this.orderdetailsService.updateById(orderdetails));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.orderdetailsService.removeByIds(idList));
    }
}