package com.evaluate.eos.impl.client.fallback;

import com.baomidou.mybatisplus.plugins.Page;
import com.chinacoal.microservice.util.result.CodeMsg;
import com.chinacoal.microservice.util.result.Result;
import com.evaluate.eos.impl.client.StatementClient;
import com.evaluate.eos.impl.pojo.StatementPojo;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by jinyabin on 2020/5/25.
 */
@Component
public class StatementClientFallback implements StatementClient {

    @Override
    public Result<Page<StatementPojo>> statementList(Integer pageIndex, Integer pageSize, StatementPojo statement) {
        return Result.error(CodeMsg.FALLBACK);
    }

    @Override
    public Result<Object> statementSave(@Valid StatementPojo statementPojo) {
        return  Result.error(CodeMsg.FALLBACK);
    }

    @Override
    public Result<Object> statementFindId(@RequestBody Map<String, Object> params) {
        return Result.error(CodeMsg.FALLBACK);
    }

    @Override
    public Result statementModify(StatementPojo statementPojo) {
        return Result.error(CodeMsg.FALLBACK);
    }

    @Override
    public Result statementDelete(Map<String, Object> params) {
        return Result.error(CodeMsg.FALLBACK);
    }
}
