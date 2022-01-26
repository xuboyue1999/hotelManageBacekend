package com.hotelmanage.hm.service;

import com.hotelmanage.hm.po.ServicePO;

import java.util.List;

public interface ServiceService {
    List<ServicePO> getByHotelId(int hotelid);
}
