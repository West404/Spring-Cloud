package com.isoftstone.user.domain;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @description:
 * @author: king
 * @time: 2021/3/8/008 16:04
 */
@Table(name = "tb_user")
@Data
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    @Column(name = "userName")
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
