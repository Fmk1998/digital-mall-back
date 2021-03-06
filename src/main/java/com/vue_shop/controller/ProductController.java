package com.vue_shop.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.vue_shop.entity.Product;
import org.springframework.web.bind.annotation.*;
import com.vue_shop.service.ProductService;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * (Product)表控制层
 *
 * @author makejava
 * @since 2020-03-27 20:20:28
 */
@RestController
@RequestMapping("product")
public class ProductController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ProductService productService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param product 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Product> page, Product product) {
        return success(this.productService.page(page, new QueryWrapper<>(product)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.productService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param product 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Product product) {
        return success(this.productService.save(product));
    }

    /**
     * 修改数据
     *
     * @param product 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Product product) {
        return success(this.productService.updateById(product));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.productService.removeByIds(idList));
    }

    /**
     * 分类
     *
     * @param cid 参数封装
     * @return Result
     */
    @GetMapping(value = "/category")
    public R login(Page<Product> page,@RequestParam("cid") Integer cid) {
        //使用mybatis-plus的Iservice中的方法getOne
        QueryWrapper<Product> wrapper = new QueryWrapper<Product>();
        wrapper.eq("cid", cid);
        return success(this.productService.pageMaps(page,wrapper));
    }
}