package com.hotelmanage.hm.service;

import com.hotelmanage.hm.po.HotelPO;

import java.util.List;

public interface HotelService {
    List<HotelPO> getHotel();
    HotelPO getById(int id);
}
