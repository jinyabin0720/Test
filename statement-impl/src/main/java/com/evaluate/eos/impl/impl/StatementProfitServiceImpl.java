package com.evaluate.eos.impl.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.evaluate.eos.impl.mappers.StatementProfitMapper;
import com.evaluate.eos.impl.pojo.StatementPojo;
import com.evaluate.eos.impl.pojo.StatementProfitPojo;
import com.evaluate.eos.impl.service.StatementProfitService;
import com.evaluate.eos.impl.util.CommonFun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinyabin on 2020/5/27.
 */
@Service
public class StatementProfitServiceImpl extends ServiceImpl<StatementProfitMapper,StatementProfitPojo> implements StatementProfitService{

    @Autowired
    StatementProfitMapper statementProfitMapper;
    @Override
    public Page statementProfitList(Integer page, Integer pageSize, StatementProfitPojo statementProfitPojo) {
        Page pages = CommonFun.getPage(page,pageSize);
        List<StatementPojo> statementPage = statementProfitMapper.statementProfitList(pages,statementProfitPojo);
        pages.setRecords(statementPage);
        return pages;
    }
}
