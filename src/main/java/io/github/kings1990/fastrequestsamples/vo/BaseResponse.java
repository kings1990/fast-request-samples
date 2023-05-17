package io.github.kings1990.fastrequestsamples.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseResponse<T> {


    private int code;

    private String message;

    private T data;
    public BaseResponse() {
    }

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

    public static <T>  BaseResponse<?> with(int code) {
        return with(code, null, null);
    }
    
    public static <T> BaseResponse<T> loginExpire() {
        return with(401, null, null);
    }

    public static <T> BaseResponse<T> with(int code, String msg) {
        return with(code, msg, null);
    }

    public static <T> BaseResponse<T> with(int code, T data) {
        return with(code, null, data);
    }

    public static <T> BaseResponse<T> with(int code, String msg, T data) {
        return new BaseResponse<>(code, msg, data);
    }
}
