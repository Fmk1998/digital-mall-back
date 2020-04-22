package com.vue_shop.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.vue_shop.entity.Comment;
import com.vue_shop.service.CommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Comment)表控制层
 *
 * @author makejava
 * @since 2020-04-19 14:42:53
 */
@RestController
@RequestMapping("comment")
public class CommentController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private CommentService commentService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param comment 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Comment> page, Comment comment) {
        return success(this.commentService.page(page, new QueryWrapper<>(comment)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.commentService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param comment 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Comment comment) {
        return success(this.commentService.save(comment));
    }

    /**
     * 修改数据
     *
     * @param comment 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Comment comment) {
        return success(this.commentService.updateById(comment));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.commentService.removeByIds(idList));
    }

    /**
     * 查询评论
     *
     * @param pid 参数封装
     * @return Result
     */
    @GetMapping(value = "/pcom")
    public R login(Page<Comment> page,@RequestParam("pid") Integer pid) {
        //使用mybatis-plus的Iservice中的方法getOne
        QueryWrapper<Comment> wrapper = new QueryWrapper<Comment>();
        wrapper.eq("pid", pid);
        return success(this.commentService.pageMaps(page,wrapper));
    }
}