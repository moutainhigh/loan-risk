package com.mod.loan.service;

import com.mod.loan.common.mapper.BaseService;
import com.mod.loan.model.DecisionPbDetail;
import com.mod.loan.model.User;

/**
 *
 */
public interface DecisionZmDetailService extends BaseService<DecisionPbDetail, Long> {


    //2.2接口调用
    DecisionPbDetail creditApply(User user, String orderNo) throws Exception;

    //2.3接口调用
    DecisionPbDetail queryCreditResult(DecisionPbDetail detail) throws Exception;

    DecisionPbDetail selectByOrderNo(String orderNo) throws Exception;
}
