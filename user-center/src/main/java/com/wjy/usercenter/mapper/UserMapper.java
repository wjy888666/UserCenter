package com.wjy.usercenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wjy.usercenter.model.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户 Mapper
 *
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}



