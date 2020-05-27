package com.evaluate.eos.impl.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.chinacoal.microservice.util.result.CodeMsg;
import com.chinacoal.microservice.util.result.Result;
import com.evaluate.eos.impl.client.StatementProfitClient;
import com.evaluate.eos.impl.pojo.StatementPojo;
import com.evaluate.eos.impl.pojo.StatementProfitPojo;
import com.evaluate.eos.impl.service.StatementProfitService;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


/**
 * Created by jinyabin on 2020/5/25.
 */
@RestController
public class StatementProfitController implements StatementProfitClient {


    @Autowired
    private StatementProfitService statementProfitService;


    @Override
    public Result statementProfitList(Integer page, Integer pageSize, StatementProfitPojo statementProfitPojo) {
        try{
            Page<StatementProfitPojo> statementPage = statementProfitService.statementProfitList(page,pageSize,statementProfitPojo);
            return Result.success(statementPage);
        }catch(Exception e){
            e.printStackTrace();
            return Result.error(CodeMsg.EXECUTE_ERROR.fillArgs(e.getMessage()));
        }
    }

    @Override
    public Result<Object> statementProfitSave(StatementProfitPojo statementProfitPojo) {
        if(statementProfitPojo==null){
            Result.error(CodeMsg.BIND_ERROR);
        }
        try {
            statementProfitService.insert(statementProfitPojo);
            return Result.success("新增成功");
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(CodeMsg.BIND_ERROR);
        }

    }

    @Override
    public Result statementProfitFindId(Map<String, Object> params) {
        String analyzeProfitsId = MapUtils.getString(params, "analyzeProfitsId");
        if (analyzeProfitsId==null&&analyzeProfitsId==""){
            return Result.error(CodeMsg.BIND_ERROR);
        }
        try {
            StatementProfitPojo statementProfitPojo =  statementProfitService.selectById(analyzeProfitsId);
            return Result.success(statementProfitPojo);
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(CodeMsg.EXECUTE_ERROR.fillArgs(e.getMessage()));
        }

    }

    @Override
    public Result statementProfitModify(StatementProfitPojo statementProfitPojo) {
        if (statementProfitPojo==null){
            return Result.error(CodeMsg.BIND_ERROR);
        }
        try {
            statementProfitService.updateAllColumnById(statementProfitPojo);
            return Result.success("修改成功");
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(CodeMsg.BIND_ERROR);
        }


    }

    @Override
    public Result statementProfitDelete(Map<String, Object> params) {
        String analyzeProfitsId = MapUtils.getString(params, "analyzeProfitsId");
        if (analyzeProfitsId==null&&analyzeProfitsId==""){
            return Result.error(CodeMsg.BIND_ERROR);
        }
        try {
              statementProfitService.deleteById(analyzeProfitsId);
            return Result.success("删除数据成功");
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(CodeMsg.EXECUTE_ERROR.fillArgs(e.getMessage()));
        }
    }
}



