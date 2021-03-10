package com.isoftstone.user.service;

import com.isoftstone.user.domain.User;
import com.isoftstone.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: king
 * @time: 2021/3/8/008 16:19
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * description on interface
     *
     * @param id@return com.isoftstone.user.domain.User
     * @author king
     * @date 2021/3/8/008 16:22
     */
    @Override
    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
