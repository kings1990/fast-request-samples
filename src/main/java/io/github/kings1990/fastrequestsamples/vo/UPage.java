package io.github.kings1990.fastrequestsamples.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "分页对象", description = "分页对象")
public class UPage<T>  {
    @ApiModelProperty(name = "current", value = "当前页", dataType = "Long")
    private long current;

    @ApiModelProperty(name = "size", value = "每页条数", dataType = "Long")
    private long size;

    @ApiModelProperty(name = "total", value = "总条数", dataType = "Long")
    private long total;

    @ApiModelProperty(name = "records", value = "数据集合", dataType = "List<T>")
    private List<T> records = Collections.emptyList();
}