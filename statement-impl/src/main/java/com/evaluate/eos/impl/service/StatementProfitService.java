package com.evaluate.eos.impl.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.evaluate.eos.impl.pojo.StatementPojo;
import com.evaluate.eos.impl.pojo.StatementProfitPojo;

/**
 * Created by jinyabin on 2020/5/27.
 */
public interface StatementProfitService extends IService<StatementProfitPojo>{

    //查询报表展示的list 接口
    Page<StatementProfitPojo> statementProfitList (Integer pageIndex, Integer pageSize, StatementProfitPojo statementProfitPojo);
}
