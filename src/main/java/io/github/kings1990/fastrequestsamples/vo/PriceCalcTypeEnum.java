package io.github.kings1990.fastrequestsamples.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 计价类型
 *
 * @author VampireAchao
 * @since 2022/6/8 18:17
 */
@Getter
@AllArgsConstructor
public enum PriceCalcTypeEnum {
    /**
     * Cheating the compiler.
     */
    FLOAT("浮动"),
    FIXED("固定值"),
    LEVEL("等级基数"),
    ;

    private final String desc;
}