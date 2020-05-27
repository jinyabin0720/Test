package com.evaluate.eos.impl.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.evaluate.eos.impl.pojo.StatementPojo;

import java.util.List;

/**
 * Created by jinyabin on 2020/5/25.
 */

public interface StatementService extends IService<StatementPojo>{

    //查询报表展示的list 接口
    Page<StatementPojo> statementList (Integer pageIndex, Integer pageSize, StatementPojo statementPojo);

}
