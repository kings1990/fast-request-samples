package io.github.kings1990.fastrequestsamples.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author zhaojd
 * @description <p>
 * 服务端返回的数据选择json作为通信中使用的标准数据交换格式
 * <p>
 * http支持使用不同的格式：纯文本、json、csv、xml、rss、html等
 * </p>
 */
@Getter
@Setter
@Accessors(chain = true)
public class JsonResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否成功：true-是 false-否
     */
    private Boolean success;

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回信息，请求失败时为失败原因
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

}