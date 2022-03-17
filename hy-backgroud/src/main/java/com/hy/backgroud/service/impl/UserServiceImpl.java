package com.hy.backgroud.service.impl;

import com.hy.backgroud.entity.User;
import com.hy.backgroud.mapper.UserMapper;
import com.hy.backgroud.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yancheng
 * @since 2022-03-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
