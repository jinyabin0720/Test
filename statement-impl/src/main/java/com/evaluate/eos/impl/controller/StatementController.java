package com.evaluate.eos.impl.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.chinacoal.microservice.util.result.CodeMsg;
import com.chinacoal.microservice.util.result.Result;
import com.evaluate.eos.impl.client.StatementClient;
import com.evaluate.eos.impl.pojo.StatementPojo;
import com.evaluate.eos.impl.service.StatementService;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

/**
 * Created by jinyabin on 2020/5/25.
 */
@RestController
public class StatementController implements StatementClient{


    @Autowired
    private StatementService statementService;



    @Override
    public Result<Page<StatementPojo>> statementList(Integer page, Integer pageSize, StatementPojo statement){
        try{
            Page<StatementPojo> statementPage = statementService.statementList(page,pageSize,statement);
            return Result.success(statementPage);
        }catch(Exception e){
            e.printStackTrace();
            return Result.error(CodeMsg.EXECUTE_ERROR.fillArgs(e.getMessage()));
        }

    }

    @Override
    public Result<Object> statementSave(StatementPojo statementPojo) {
        try {
            statementPojo.setCreationDate(new Date()); //set 一个创建时间
             statementService.insert(statementPojo);
            return Result.success("报表新增成功");
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(CodeMsg.EXECUTE_ERROR.fillArgs(e.getMessage()));
        }

    }

    /**
     * 收入回显的详情信息
     * */

    @Override
    public Result statementFindId(Map<String, Object> params) {
        String analyzeIncomeId = MapUtils.getString(params, "analyzeIncomeId");
        if (analyzeIncomeId==null&&analyzeIncomeId==""){
            return Result.error(CodeMsg.BIND_ERROR);
        }
        try {
            StatementPojo statementPojo =  statementService.selectById(analyzeIncomeId);
            return Result.success(statementPojo);
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(CodeMsg.EXECUTE_ERROR.fillArgs(e.getMessage()));
        }

    }

    /**
     * 收入修改的方法
     * */
    @Override
    public Result statementModify(StatementPojo statementPojo) {
        if(statementPojo!=null){
            statementService.updateAllColumnById(statementPojo);
           return Result.success("修改成功");
        }
        return Result.error(CodeMsg.BIND_ERROR);
    }

    /**
     * 根据id 删除数据
     * */
    @Override
    public Result statementDelete(Map<String, Object> params) {
        String analyzeIncomeId = MapUtils.getString(params, "analyzeIncomeId");
        if(analyzeIncomeId==null&&analyzeIncomeId==""){
            Result.error(CodeMsg.BIND_ERROR);
        }
        try {
            statementService.deleteById(analyzeIncomeId);
            return Result.success("删除数据成功");
        }catch (Exception e){
            e.printStackTrace();
            return Result.error(CodeMsg.BIND_ERROR);
        }


    }


}
