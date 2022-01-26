package com.hotelmanage.hm.serviceImpl;

import com.hotelmanage.hm.mapper.UserMapper;
import com.hotelmanage.hm.po.UserPO;
import com.hotelmanage.hm.po.UserPOExample;
import com.hotelmanage.hm.service.UserService;
import com.hotelmanage.hm.vo.UserVO;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserPO getUser(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserPO getUserByName(String name) {
        return userMapper.selectByName(name);
    }

    @Override
    public List<UserPO> getAll() {
        return userMapper.selectByExample(new UserPOExample());
    }

    @Override
    public int register(UserVO userVO) {

        userVO.setPassword(DigestUtils.md5Hex(userVO.getPassword()));
        System.out.println(userVO);
        UserPO userPO = new UserPO();

        BeanUtils.copyProperties(userVO,userPO);
        userPO.setState(1);
        userPO.setType(1);
        int result = userMapper.insert(userPO);
        return result;
    }

    @Override
    public int updateUser(UserVO user) {
        if(user.getPassword()!=null && user.getPassword()!=""&& user.getPassword().length()>0){
            user.setPassword(DigestUtils.md5Hex(user.getPassword()));
        }
        UserPO userPO = new UserPO();
        BeanUtils.copyProperties(user,userPO);
        int result = userMapper.updateByPrimaryKeySelective(userPO);
        return result;
    }

    @Override
    public int resetpsw(String username, String password) {
        UserPO user = userMapper.selectByName(username);
        UserPO userPO = new UserPO();
        userPO.setId(user.getId());
        String encode = DigestUtils.md5Hex(password);
        userPO.setPassword(encode);
        return userMapper.updateByPrimaryKeySelective(userPO);
    }

    @Override
    public UserVO login(String username, String password) {
        UserPO userPO = userMapper.selectByName(username);
        String encode = DigestUtils.md5Hex(password);
        if(userPO.getPassword().equals(encode)||userPO.getPassword()==encode){
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(userPO,userVO);
            return userVO;
        }
        return null;
    }
}
