package com.evaluate.eos.impl.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * Created by jinyabin on 2020/5/25.
 */
@TableName("xip_ba_data_analyze_income")
@ApiModel(
        value = "收入报表实体",
        description = "收入报表实体"
)
public class StatementPojo {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty(
            value = "收入id",
            example = "更新收入时必传"
    )
    @TableId(type = IdType.UUID ,value = "ANALYZE_INCOME_ID")
    private String analyzeIncomeId;

    @ApiModelProperty(
            value = "期间（yyyy-mm）",
            example = "期间查询必传",
            required = true
    )
    @NotBlank(
            message = "更新时，主键不能为空: PERIOD_CODE"
    )
    @TableField("PERIOD_CODE")
    private String periodCode;

    @ApiModelProperty(
            value = "组织名称",
            example = "",
            required = false
    )
    @TableField("OU_NAME")
    private String ouName;

    @ApiModelProperty(
            value = "预算",
            example = "",
            required = false
    )
    @TableField("BUDGET")
    private Integer budget;

    @ApiModelProperty(
            value = "本月完成",
            example = "",
            required = false
    )
    @TableField("MONTH_COMPLETE")
    private Integer monthComplete;

    @ApiModelProperty(
            value = "本年累计",
            example = "",
            required = false
    )
    @TableField("YEAR_TOTAL")
    private Integer yearTotal;

    @ApiModelProperty(
            value = "预算完成度",
            example = "",
            required = false
    )
    @TableField("BUDGET_COMPLETE_DEGREE")
    private Integer budgetCompleteDegree;

    @ApiModelProperty(
            value = "累计同比（+/-）",
            example = "",
            required = false
    )
    @TableField("COMPARE_TOTAL")
    private Integer compareTotal;

    @ApiModelProperty(
            value = "累计同比（%）",
            example = "",
            required = false
    )
    @TableField("COMPARE_TOTAL_PERCENT")
    private Integer compareTotalPercent;


    @ApiModelProperty(
            value = "创建人",
            example = "",
            required = false
    )
    @TableField("CREATED_BY")
    private String createdBy;


    @ApiModelProperty(
            value = "创建日期",
            example = "",
            required = false
    )
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm",
            locale = "zh",
            timezone = "GMT+8"
    )
    @TableField("CREATION_DATE")
    private Date creationDate;

    @ApiModelProperty(
            value = "最后更新人",
            example = "",
            required = false
    )
    @TableField("LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @ApiModelProperty(
            value = "最后更新日期",
            example = "",
            required = false
    )
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm",
            locale = "zh",
            timezone = "GMT+8"
    )
    @TableField("LAST_UPDATE_DATE")
    private Date lastUpdateDate;

    @ApiModelProperty(
            value = "显示顺序",
            example = "",
            required = false
    )
    @TableField("DISPLAY_ORDER")
    private String displayOrder;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAnalyzeIncomeId() {
        return analyzeIncomeId;
    }

    public void setAnalyzeIncomeId(String analyzeIncomeId) {
        this.analyzeIncomeId = analyzeIncomeId;
    }

    public String getPeriodCode() {
        return periodCode;
    }

    public void setPeriodCode(String periodCode) {
        this.periodCode = periodCode;
    }

    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public Integer getMonthComplete() {
        return monthComplete;
    }

    public void setMonthComplete(Integer monthComplete) {
        this.monthComplete = monthComplete;
    }

    public Integer getYearTotal() {
        return yearTotal;
    }

    public void setYearTotal(Integer yearTotal) {
        this.yearTotal = yearTotal;
    }

    public Integer getBudgetCompleteDegree() {
        return budgetCompleteDegree;
    }

    public void setBudgetCompleteDegree(Integer budgetCompleteDegree) {
        this.budgetCompleteDegree = budgetCompleteDegree;
    }

    public Integer getCompareTotal() {
        return compareTotal;
    }

    public void setCompareTotal(Integer compareTotal) {
        this.compareTotal = compareTotal;
    }

    public Integer getCompareTotalPercent() {
        return compareTotalPercent;
    }

    public void setCompareTotalPercent(Integer compareTotalPercent) {
        this.compareTotalPercent = compareTotalPercent;
    }


    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(String displayOrder) {
        this.displayOrder = displayOrder;
    }


    @Override
    public String toString() {
        return "StatementPojo{" +
                "analyzeIncomeId='" + analyzeIncomeId + '\'' +
                ", periodCode='" + periodCode + '\'' +
                ", ouName='" + ouName + '\'' +
                ", budget=" + budget +
                ", monthComplete=" + monthComplete +
                ", yearTotal=" + yearTotal +
                ", budgetCompleteDegree=" + budgetCompleteDegree +
                ", compareTotal=" + compareTotal +
                ", compareTotalPercent=" + compareTotalPercent +
                ", createdBy='" + createdBy + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", lastUpdateDate=" + lastUpdateDate +
                ", displayOrder='" + displayOrder + '\'' +
                '}';
    }
}
