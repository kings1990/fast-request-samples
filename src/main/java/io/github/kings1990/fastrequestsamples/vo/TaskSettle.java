package io.github.kings1990.fastrequestsamples.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author VampireAchao
 * @since 2023/4/23 15:12
 */
@Data
public class TaskSettle extends NormalEntity<TaskSettle> {

    private @ApiModelProperty("规则id") Integer ruleId;
    private @ApiModelProperty("用户id") String userId;
    private @ApiModelProperty("评级id") Integer ratingId;
    private @ApiModelProperty("职位id") String positionId;
    private @ApiModelProperty("部门id") String departId;
    private @ApiModelProperty("作品id") Integer productId;
    private @ApiModelProperty("平台id") Integer platformId;
    private @ApiModelProperty("阶段id") Integer stageId;
    private @ApiModelProperty("任务id") Integer taskId;
    private @ApiModelProperty("结算id") Long settleId;
    private @ApiModelProperty("单价") BigDecimal unitPrice;
    private @ApiModelProperty("结算数量") BigDecimal calcCount;
    private @ApiModelProperty("结算单位") UnitEnum calcUnit;
    private @ApiModelProperty("价格") BigDecimal resultPrice;
    private @ApiModelProperty("币种") UnitEnum moneyType;
    private @ApiModelProperty("公式") String formula;
    private @ApiModelProperty("价格计算类型") PriceCalcTypeEnum priceCalcType;
    private @ApiModelProperty("评级") String level;
    private @ApiModelProperty("人员等级单价基数") BigDecimal levelBasePrice;
    private @ApiModelProperty("系数") BigDecimal factor;



}
