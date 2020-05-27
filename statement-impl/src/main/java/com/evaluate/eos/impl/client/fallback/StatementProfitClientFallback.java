package com.evaluate.eos.impl.client.fallback;

import com.chinacoal.microservice.util.result.CodeMsg;
import com.chinacoal.microservice.util.result.Result;
import com.evaluate.eos.impl.client.StatementProfitClient;
import com.evaluate.eos.impl.pojo.StatementProfitPojo;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by jinyabin on 2020/5/27.
 */
@Component
public class StatementProfitClientFallback implements StatementProfitClient{

    @Override
    public Result<Page<StatementProfitPojo>> statementProfitList(Integer page, Integer pageSize, StatementProfitPojo statementProfitPojo) {
        return Result.error(CodeMsg.FALLBACK);
    }

    @Override
    public Result<Object> statementProfitSave(StatementProfitPojo statementProfitPojo) {
        return Result.error(CodeMsg.FALLBACK);
    }

    @Override
    public Result statementProfitFindId(Map<String, Object> params) {
        return Result.error(CodeMsg.FALLBACK);
    }

    @Override
    public Result statementProfitModify(StatementProfitPojo statementProfitPojo) {
        return Result.error(CodeMsg.FALLBACK);
    }

    @Override
    public Result statementProfitDelete(Map<String, Object> params) {
        return Result.error(CodeMsg.FALLBACK);
    }
}
