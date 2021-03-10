package com.isoftstone.user.service;

import com.isoftstone.user.domain.User;

/**
 * @author Administrator
 */
public interface UserService {
    /**
     * description on interface
     *
     * @param id
     * @return com.isoftstone.user.domain.User
     * @author king
     * @date 2021/3/8/008 16:22
     */
    User findById(Long id);
}
