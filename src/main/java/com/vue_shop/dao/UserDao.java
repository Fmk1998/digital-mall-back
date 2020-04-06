package com.vue_shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vue_shop.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2020-01-07 16:59:40
 */

public interface UserDao extends BaseMapper<User> {
}