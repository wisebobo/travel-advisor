package com.benny.traveladvisor.dto;

import com.benny.traveladvisor.common.enums.ErrorEnums;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Description: DTO class of Error message response
 * @author benny.li
 * Date: 2020/5/18
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "Error Response")
public class ErrorResponse implements Serializable {

    private static final long serialVersionUID = -2506420860001546269L;

    @JsonIgnore
    private int status;

    @JsonProperty("code")
    @ApiModelProperty(value = "Error Code", position = 1)
    private String code;

    @JsonProperty("msg")
    @ApiModelProperty(value = "Error Message", position = 2)
    private String msg;

    public ErrorResponse(ErrorEnums errorEnums) {
        this.status = errorEnums.getStatus();
        this.code = errorEnums.getCode();
        this.msg = errorEnums.getMsg();
    }

    public static final ErrorResponse INVALID_PARAMETER = new ErrorResponse(ErrorEnums.INVALID_PARAMETER);
    public static final ErrorResponse INVALID_TIMESTAMP = new ErrorResponse(ErrorEnums.INVALID_TIMESTAMP);
    public static final ErrorResponse UNAUTHORIZED = new ErrorResponse(ErrorEnums.UNAUTHORIZED);
    public static final ErrorResponse PARTNER_NOT_FOUND = new ErrorResponse(ErrorEnums.PARTNER_NOT_FOUND);
    public static final ErrorResponse ACCESS_FORBIDDEN = new ErrorResponse(ErrorEnums.ACCESS_FORBIDDEN);
    public static final ErrorResponse INVALID_SIGNATURE = new ErrorResponse(ErrorEnums.INVALID_SIGNATURE);
    public static final ErrorResponse NOT_FOUND = new ErrorResponse(ErrorEnums.NOT_FOUND);
    public static final ErrorResponse METHOD_NOT_ALLOW = new ErrorResponse(ErrorEnums.METHOD_NOT_ALLOW);
    public static final ErrorResponse SERVER_ERROR = new ErrorResponse(ErrorEnums.SERVER_ERROR);

}
