package com.vue_shop.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.vue_shop.entity.Result;
import com.vue_shop.entity.User;
import com.vue_shop.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-01-07 16:59:40
 */
@RestController
@RequestMapping("user")
public class UserController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param user 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<User> page, User user) {
        return success(this.userService.page(page, new QueryWrapper<>(user)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param uid 主键
     * @return 单条数据
     */
    @GetMapping("{uid}")
    public R selectOne(@PathVariable Serializable uid) {
        return success(this.userService.getById(uid));
    }

    /**
     * 登录
     *
     * @param user 参数封装
     * @return Result
     */
    @PostMapping(value = "/login")
    public Result login(@RequestBody User user) {
        System.out.println(user.getUname());
        //使用mybatis-plus的Iservice中的方法getOne
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        wrapper.eq("uname", user.getUname());
        User newuser = this.userService.getOne(wrapper);
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        String userpwd = user.getPassword();
        String newuserpwd = newuser.getPassword();
        if ( userpwd.equals(newuserpwd)){
            result.setMsg("登录成功");
            result.setSuccess(true);
            result.setDetail(newuser);
        }else{
            result.setMsg(newuser.getPassword()+"用户名或密码错误"+user.getPassword());
        }
        return result;
    }

    /**
     * 新增数据
     *
     * @param user 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody User user) {
        return success(this.userService.save(user));
    }

    /**
     * 修改数据
     *
     * @param user 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody User user) {
        return success(this.userService.updateById(user));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.userService.removeByIds(idList));
    }
}