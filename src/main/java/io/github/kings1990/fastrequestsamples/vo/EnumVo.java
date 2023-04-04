package io.github.kings1990.fastrequestsamples.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class EnumVo {
    private Integer id;
    @ApiModelProperty(example = "MANAGEMENT_CONTROL_HIERARCHY")
    private Model model;
}
