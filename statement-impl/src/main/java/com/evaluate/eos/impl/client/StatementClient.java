package com.evaluate.eos.impl.client;

import com.baomidou.mybatisplus.plugins.Page;
import com.chinacoal.microservice.util.result.Result;
import com.evaluate.eos.impl.client.fallback.StatementClientFallback;
import com.evaluate.eos.impl.pojo.StatementPojo;
import io.swagger.annotations.Api;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by jinyabin on 2020/5/25.
 */
@Api(tags = "收入报表展示")
@FeignClient(name = "ccms-statement",configuration = FeignAutoConfiguration.class,fallback = StatementClientFallback.class)
public interface StatementClient {

    /**
     * 收入报表查询展示接口
     * */
    @PostMapping("statement/list/")
     Result<Page<StatementPojo>> statementList(Integer page, Integer pageSize, @RequestBody StatementPojo statement);
    /***
     *
     * 收入报表增加方法
     */
    @PostMapping("statement/save")
    Result<Object> statementSave(@RequestBody  StatementPojo statementPojo);



    /**
     * 收入修改的回显详情信息
     * */
    @PostMapping("statement/findId")
    Result statementFindId(@RequestBody Map<String, Object> params);


    /**
     *
     * 修改收入的信息
     * */
    @PutMapping("statement/modify")
    Result statementModify(@RequestBody StatementPojo statementPojo);



    /**
     * 根据id 删除收入数据
     * */
    @PostMapping("statement/delete")
    Result statementDelete(@RequestBody Map<String, Object> params);
}
