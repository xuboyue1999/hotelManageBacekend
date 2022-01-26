package com.hotelmanage.hm.mapper;

import com.hotelmanage.hm.po.HotelPO;
import com.hotelmanage.hm.po.HotelPOExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HotelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HotelPO record);

    int insertSelective(HotelPO record);

    HotelPO selectOneByExample(HotelPOExample example);

    List<HotelPO> selectByExample(HotelPOExample example);

    HotelPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HotelPO record);

    int updateByPrimaryKey(HotelPO record);
}