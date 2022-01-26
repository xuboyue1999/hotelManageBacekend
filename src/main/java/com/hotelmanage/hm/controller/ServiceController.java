package com.hotelmanage.hm.controller;

import com.hotelmanage.hm.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @RequestMapping("get")
    public Object get(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("service",serviceService.getByHotelId(2));
        return map;
    }
}
