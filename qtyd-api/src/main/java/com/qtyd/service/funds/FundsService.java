package com.qtyd.service.funds;

import com.qtyd.model.User;

import java.util.Map;

/**
 * 资金相关接口
 * Created by huc on 2017/12/20.
 */
public interface FundsService {
    /***
     * 查询用户的资金情况
     * @param userId 用户id
     * @return
     */
    User userFundsByUserId(Long userId);
}
