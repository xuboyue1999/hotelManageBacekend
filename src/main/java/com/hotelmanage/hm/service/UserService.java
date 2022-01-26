package com.hotelmanage.hm.service;

import com.hotelmanage.hm.po.UserPO;
import com.hotelmanage.hm.vo.UserVO;

import java.util.List;

public interface UserService {
    UserPO getUser(int id);
    UserPO getUserByName(String name);
    List<UserPO> getAll();
    int register(UserVO userVO);
    int updateUser(UserVO user);
    int resetpsw(String username, String password);
    UserVO login(String username, String password);
}
