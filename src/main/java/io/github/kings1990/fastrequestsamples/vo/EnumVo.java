package io.github.kings1990.fastrequestsamples.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class EnumVo {
    private Integer id;
    @ApiModelProperty(example = "Saturday")
    private Week model;
    
    public static enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday,Saturday, Sunday
    }
}
