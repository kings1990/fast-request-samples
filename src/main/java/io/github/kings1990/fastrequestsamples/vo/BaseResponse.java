package io.github.kings1990.fastrequestsamples.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@ApiModel("返回基础实体")
public class BaseResponse<T> {

    /**
     * 返回码(最大最小值仅为了设置前端mock默认值, 不表示code的实际内容)
     */
    @ApiModelProperty("返回码, 0为成功, 其他值为失败")
    private int code;

    @ApiModelProperty("描述内容, 一般在code不为0时有意义")
    private String message;

    @ApiModelProperty("数据内容, code不为0时, 该值一般为null")
    private T data;


    public BaseResponse(int code) {
        this(code, null, null);
    }

    public BaseResponse(int code, String message) {
        this(code, message, null);
    }

    public BaseResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }



    public static BaseResponse<?> with(int code) {
        return with(code, null, null);
    }

    public static BaseResponse<?> with(int code, String msg) {
        return with(code, msg, null);
    }

    public static <T> BaseResponse<T> with(int code, T data) {
        return with(code, null, data);
    }

    public static <T> BaseResponse<T> with(int code, String msg, T data) {
        return new BaseResponse<>(code, msg, data);
    }
}
