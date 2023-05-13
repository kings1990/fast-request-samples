package io.github.kings1990.fastrequestsamples.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author VampireAchao
 * @since 2022/12/21 10:16
 */
@Data
public abstract class NormalEntity<T extends NormalEntity<T>> implements Serializable {

    /**
     * 主键，自增，无符号
     */
    protected Long id;

    /**
     * 数据创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime gmtCreate;

    /**
     * 数据修改时间
     */
    @JsonIgnore
    protected LocalDateTime gmtModified;

    /**
     * 数据创建人员
     */
    @JsonIgnore
    protected String creatorId;

    /**
     * 数据修改人员
     */
    @JsonIgnore
    protected String modifierId;

    protected List<Long> dataIds;

    @JsonIgnore
    public List<Long> getDataIds() {
        return dataIds;
    }

    @JsonProperty("ids")
    public void setDataIds(List<Long> dataIds) {
        this.dataIds = dataIds;
    }

    public List<Long> getIds() {
        return dataIds;
    }

    public void setIds(List<Long> dataIds) {
        this.dataIds = dataIds;
    }


}
