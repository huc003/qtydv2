package com.qtyd.dao.funds;

import com.qtyd.model.User;
import com.qtyd.model.UserWithBLOBs;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    UserWithBLOBs selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);
}