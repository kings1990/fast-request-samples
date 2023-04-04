package io.github.kings1990.fastrequestsamples.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BaseDto {
    @ApiModelProperty(value = "page", example = "2")
    private int page = 1;
}
