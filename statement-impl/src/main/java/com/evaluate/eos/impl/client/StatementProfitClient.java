package com.evaluate.eos.impl.client;

import com.chinacoal.microservice.util.result.Result;
import com.evaluate.eos.impl.client.fallback.StatementProfitClientFallback;
import com.evaluate.eos.impl.pojo.StatementProfitPojo;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;


/**
 * Created by jinyabin on 2020/5/27.
 */
@Api(tags = "利润报表展示")
@FeignClient(name = "ccms-statementProfit",configuration = FeignAutoConfiguration.class,fallback = StatementProfitClientFallback.class)
public interface StatementProfitClient {


    /**
     * 利润报表查询展示接口
     * */
    @PostMapping("statementProfit/list/")
    Result<Page<StatementProfitPojo>> statementProfitList(Integer page, Integer pageSize, @RequestBody StatementProfitPojo statementProfitPojo);


    /***
     *
     * 收入报表增加方法
     */
    @PostMapping("statementProfit/save")
    Result<Object> statementProfitSave(@RequestBody  StatementProfitPojo statementProfitPojo);



    /**
     * 收入修改的回显详情信息
     * */
    @PostMapping("statementProfit/findId")
    Result statementProfitFindId(@RequestBody Map<String, Object> params);


    /**
     *
     * 修改收入的信息
     * */
    @PutMapping("statementProfit/modify")
    Result statementProfitModify(@RequestBody StatementProfitPojo statementProfitPojo);



    /**
     * 根据id 删除收入数据
     * */
    @PostMapping("statementProfit/delete")
    Result statementProfitDelete(@RequestBody Map<String, Object> params);
}
