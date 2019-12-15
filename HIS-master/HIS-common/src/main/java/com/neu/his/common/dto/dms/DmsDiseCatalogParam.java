package com.neu.his.common.dto.dms;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class DmsDiseCatalogParam  implements Serializable {
    @ApiModelProperty(value = "疾病分类名")
    private String name;
    @ApiModelProperty(value = "状态")
    private Integer status;
}
