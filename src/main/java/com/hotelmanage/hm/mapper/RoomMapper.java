package com.hotelmanage.hm.mapper;

import com.hotelmanage.hm.po.RoomPO;
import com.hotelmanage.hm.po.RoomPOExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoomPO record);

    int insertSelective(RoomPO record);

    RoomPO selectOneByExample(RoomPOExample example);

    List<RoomPO> selectByExample(RoomPOExample example);

    RoomPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoomPO record);

    int updateByPrimaryKey(RoomPO record);

    List<RoomPO> getByHotelId(int hotelid);
}