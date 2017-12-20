package com.example.controller.funds;

import com.qtyd.service.funds.FundsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by huc on 2017/12/20.
 */
@RestController
@RequestMapping("/funds")
@Api(value="onlinestore", description="资金操作类")
public class FundsController {

    @Autowired
    private FundsService fundsService;

    @RequestMapping(value = "/funds_user",method = RequestMethod.GET)
    @ApiOperation(value = "用户资金信息",notes = "")
    @ApiImplicitParam(name = "userId",value = "用户ID",required = true,dataType = "Long",paramType = "query")
    public String fundsUserByUserId(@RequestParam("userId") Long userId){
        Map<String,Object> userFunds = fundsService.userFundsByUserId(userId);
        String money = userFunds.get("user_id_"+userId)+"";
        return money;
    }
}
