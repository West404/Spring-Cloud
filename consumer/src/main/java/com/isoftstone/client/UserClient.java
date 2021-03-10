package com.isoftstone.client;

import com.isoftstone.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Administrator
 */
@FeignClient("user-service")
public interface UserClient {
    /**
     * description on interface
     *
     * @param id
     * @return com.isoftstone.domain.User
     * @author king
     * @date 2021/3/10/010 14:59
     */
    @GetMapping("/user/{id}")
    User queryById(@PathVariable("id") Long id);

}
