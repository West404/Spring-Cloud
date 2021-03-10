package com.isoftstone.domain;

import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: king
 * @time: 2021/3/8/008 16:54
 */
@Data
public class User {
    private Long id;

    private String userName;

    private String password;

    private String name;

    private Integer age;

    private Integer sex;

    private Date birthday;

    private Date created;

    private Date updated;

    private String note;
}
