package com.evaluate.eos.impl.mappers;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.evaluate.eos.impl.pojo.StatementPojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by jinyabin on 2020/5/25.
 */
@Mapper
public interface StatementMapper extends BaseMapper<StatementPojo> {


    List<StatementPojo> statementList (Page<StatementPojo> pages ,StatementPojo statementPojo) ;



}
