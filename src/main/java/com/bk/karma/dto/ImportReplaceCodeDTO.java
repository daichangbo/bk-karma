package com.bk.karma.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author
 * @date 2019-12-18 17:50
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImportReplaceCodeDTO implements Serializable {

    private static final long serialVersionUID = -8413831231401769355L;

    @ApiModelProperty(value = "配件编码", required = true)
    private String partsCode;

    @ApiModelProperty(value = "替换码", required = true)
    private String replacePartsCode;

    public String getPartsCode () {
        return partsCode;
    }

    public void setPartsCode ( String partsCode ) {
        this.partsCode = partsCode;
    }

    public String getReplacePartsCode () {
        return replacePartsCode;
    }

    public void setReplacePartsCode ( String replacePartsCode ) {
        this.replacePartsCode = replacePartsCode;
    }
}
