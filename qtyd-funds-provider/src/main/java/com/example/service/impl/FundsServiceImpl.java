package com.example.service.impl;

import com.qtyd.dao.funds.UserMapper;
import com.qtyd.model.User;
import com.qtyd.service.funds.FundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 资金相关实现类
 * Created by huc on 2017/12/20.
 */
@Service
public class FundsServiceImpl implements FundsService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User userFundsByUserId(Long userId) {
//        Map<String,Object> userFunds = new LinkedHashMap<String,Object>();
//        for (int i = 0; i < 10; i++) {
//            userFunds.put("user_id_"+i,i*1000);
//        }
        User user = userMapper.selectByPrimaryKey(1274829);
        System.out.println(user.getUsername());
        System.out.println(user.getUserId());
        return user;
    }
}
