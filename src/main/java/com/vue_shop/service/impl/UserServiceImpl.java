package com.vue_shop.service.impl;

        import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
        import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
        import com.vue_shop.entity.Result;
        import com.vue_shop.dao.UserDao;
        import com.vue_shop.entity.User;
        import com.vue_shop.service.UserService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-01-07 16:59:40
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

/*        private UserDao userDao;

        @Override
        public Result login(User user) {
                Result result = new Result();
                result.setSuccess(false);
                result.setDetail(null);
                QueryWrapper<User> wrapper = new QueryWrapper<User>();
                wrapper.eq("uname", user.getUname());
                User userInfo= userDao.selectOne(wrapper);
                System.out.println(userInfo);
                *//*try {
                        User uid = userDao.login(user);
                        System.out.println(uid);
                        if(uid == null){
                                result.setMsg("用户名或密码错误");
                        }else{
                                result.setMsg("登录成功");
                                result.setSuccess(true);
                                result.setDetail(uid);
                        }
                } catch (Exception e) {
                        result.setMsg(e.getMessage());
                        e.printStackTrace();
                }*//*
                return result;
        }*/
}