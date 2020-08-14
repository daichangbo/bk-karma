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
    @DataInit(defaultValue = "100")
    private Long answerUserCount;
    @DataInit(defaultValue = "0")
    @ApiModelProperty("发言次数")
    private Long speakCount;
    @ApiModelProperty("发言人数")
    @DataInit(defaultValue = "12312321")
    private String speakUserCount;
    @ApiModelProperty("禁言次数")
    @DataInit(defaultValue = "11")
    private Integer banSpeakCount;
    @DataInit(defaultValue = "0")
    @ApiModelProperty("禁言人数")
    private Long banSpeakUserCount;
    @DataInit(defaultValue = "0")
    @ApiModelProperty("仅观看回放人数")
    private Long onlyPlayBackCount;
    @DataInit(defaultValue = "0")
    @ApiModelProperty("观看回放人数")
    private Long playBackCount;

}
