package io.github.kings1990.fastrequestsamples.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 范围单位
 *
 * @author VampireAchao
 * @since 2022/6/2 16:15
 */
@Getter
@AllArgsConstructor
public enum UnitEnum {
    /**
     * 阶段/月份/默认
     */
    EACH("个"),
    // 作品每一章
    CHAPTER("话"),
    // 整部作品
    VOLUME("部"),
    CNY("元"),
    TWD("元"),
    JPY("円"),
    USD("美刀"),
    PAGE("页"),
    THOUSAND("千字"),
    WORD("字"),
    PERCENT("%"),
    GRID("格"),
    UNKNOWN("未知"),
    ;


    private final String desc;
}