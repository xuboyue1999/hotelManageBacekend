package com.hotelmanage.hm.vo;

import com.hotelmanage.hm.po.RoomPO;
import com.hotelmanage.hm.po.ServicePO;

import java.util.List;

public class HotelVO {
    private Integer id;

    private String name;

    private String address;

    private String instruction;

    private Integer phone;

    private Integer star;

    private List<RoomPO> rooms;

    private List<ServicePO> services;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public List<RoomPO> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomPO> rooms) {
        this.rooms = rooms;
    }

    public List<ServicePO> getServices() {
        return services;
    }

    public void setServices(List<ServicePO> services) {
        this.services = services;
    }
}
