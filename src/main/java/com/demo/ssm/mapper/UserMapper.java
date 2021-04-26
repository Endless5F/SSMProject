package com.demo.ssm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.ssm.entity.User;

/**
 * mybatis-plus mapper继承自BaseMapper，而此基类中自动提供一系列CURD方法
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * spring自定的mapper映射，映射到mappers的xml中对应的sql语句
     */
    void insertSpring();
}
