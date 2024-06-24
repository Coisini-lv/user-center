package com.dull.usercenter.mapper;

import com.dull.usercenter.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author lvshuaihang
* @description 针对表【user】的数据库操作Mapper
* @createDate 2024-06-23 17:11:53
* @Entity com.dull.usercenter.model.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




