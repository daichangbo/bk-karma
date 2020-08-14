package com.bk.karma.test;

import com.bk.karma.annotation.DataInit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel
public class StudentIndexDto {
    @ApiModelProperty("ID")
    private String id;
    @ApiModelProperty("课程ID")
    private String lessonId;
    @ApiModelProperty(value = "用户ID",hidden = true)
    private String userId;
    @ApiModelProperty("讲次类型 0：大班课 2：小班课")
    private Integer classType;

}
