package com.lei.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lei.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author leiqq
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
