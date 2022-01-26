package com.hotelmanage.hm.mapper;

import com.hotelmanage.hm.po.UserPO;
import com.hotelmanage.hm.po.UserPOExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPO record);

    int insertSelective(UserPO record);

    UserPO selectOneByExample(UserPOExample example);

    List<UserPO> selectByExample(UserPOExample example);

    UserPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPO record);

    int updateByPrimaryKey(UserPO record);

    UserPO selectByName(String name);

}