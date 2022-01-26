package com.hotelmanage.hm.serviceImpl;

import com.hotelmanage.hm.mapper.HotelMapper;
import com.hotelmanage.hm.po.HotelPO;
import com.hotelmanage.hm.po.HotelPOExample;
import com.hotelmanage.hm.service.HotelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Resource
    private HotelMapper hotelMapper;

    @Override
    public List<HotelPO> getHotel() {
        HotelPOExample he = new HotelPOExample();
        return hotelMapper.selectByExample(he);
    }

    @Override
    public HotelPO getById(int id) {
        return hotelMapper.selectByPrimaryKey(id);
    }
}
