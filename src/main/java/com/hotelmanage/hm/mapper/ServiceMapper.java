package com.hotelmanage.hm.mapper;

import com.hotelmanage.hm.po.ServicePO;
import com.hotelmanage.hm.po.ServicePOExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ServiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServicePO record);

    int insertSelective(ServicePO record);

    ServicePO selectOneByExample(ServicePOExample example);

    List<ServicePO> selectByExample(ServicePOExample example);

    ServicePO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServicePO record);

    int updateByPrimaryKey(ServicePO record);

    List<ServicePO> getByHotelId(int hotelid);
}