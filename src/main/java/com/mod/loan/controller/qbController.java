package com.mod.loan.controller;

import com.mod.loan.model.DecisionPbDetail;
import com.mod.loan.model.User;
import com.mod.loan.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * loan-pay 2019/4/22 huijin.shuailijie Init
 */
@Slf4j
@RequestMapping("/qb")
@RestController
public class qbController {

    @Autowired
    private DecisionPbDetailService decisionPbDetailService;


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/creditApply")
    public String creditApply() throws Exception {
        User user =userService.selectByPrimaryKey((long)940);
        String orderNo="1665673124496871424";
        DecisionPbDetail decisionPbDetail = decisionPbDetailService.creditApply(user, orderNo);
        return String.valueOf(decisionPbDetail);
    }

    @RequestMapping(value = "/queryCreditResult")
    public String queryCreditResult() throws Exception {
        DecisionPbDetail detail = decisionPbDetailService.selectByPrimaryKey((long)282);
        DecisionPbDetail decisionPbDetail = decisionPbDetailService.queryCreditResult(detail);
        return String.valueOf(decisionPbDetail);
    }


}