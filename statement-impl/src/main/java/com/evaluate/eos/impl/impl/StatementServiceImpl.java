package com.evaluate.eos.impl.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.evaluate.eos.impl.mappers.StatementMapper;
import com.evaluate.eos.impl.pojo.StatementPojo;
import com.evaluate.eos.impl.service.StatementService;
import com.evaluate.eos.impl.util.CommonFun;
import com.github.pagehelper.page.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinyabin on 2020/5/25.
 */
@Service
public class StatementServiceImpl extends ServiceImpl<StatementMapper,StatementPojo> implements StatementService {

    @Autowired
    private StatementMapper statementMapper;

    @Override
    public Page statementList(Integer page, Integer pageSize, StatementPojo statementPojo) {
            Page pages = CommonFun.getPage(page,pageSize);
            List<StatementPojo> statementPage = statementMapper.statementList(pages,statementPojo);
            pages.setRecords(statementPage);
            return pages;
    }
}
