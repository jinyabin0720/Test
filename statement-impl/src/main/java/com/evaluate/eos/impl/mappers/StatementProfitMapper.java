package com.evaluate.eos.impl.mappers;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.evaluate.eos.impl.pojo.StatementProfitPojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by jinyabin on 2020/5/27.
 */
@Mapper
public interface StatementProfitMapper extends BaseMapper<StatementProfitPojo>{

    List<StatementProfitPojo> statementProfitList(Page<StatementProfitPojo> pages , StatementProfitPojo statementProfitPojo);


}
