package com.bk.karma.test;

import com.bk.karma.annotation.DataInit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

@Data
@ApiModel
public class LessonIndexDto extends StudentIndexDto{

    @DataInit(defaultValue = "1wwww")
    @ApiModelProperty("签到人数")
    private String signInCount;

    @DataInit(defaultValue = "0.00")
    @ApiModelProperty("迟到率")
    private BigDecimal lateRate;

}
