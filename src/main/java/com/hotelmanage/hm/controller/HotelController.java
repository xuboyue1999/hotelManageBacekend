package com.hotelmanage.hm.controller;

import com.hotelmanage.hm.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @RequestMapping("getHotel")
    public Object get(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("hotel",hotelService.getHotel());
        return map;
    }
}
