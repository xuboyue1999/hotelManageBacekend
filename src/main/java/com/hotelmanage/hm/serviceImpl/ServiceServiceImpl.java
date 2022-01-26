package com.hotelmanage.hm.serviceImpl;

import com.hotelmanage.hm.mapper.ServiceMapper;
import com.hotelmanage.hm.po.ServicePO;
import com.hotelmanage.hm.service.ServiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {

    @Resource
    private ServiceMapper serviceMapper;
    @Override
    public List<ServicePO> getByHotelId(int hotelid) {
        return serviceMapper.getByHotelId(hotelid);
    }
}
