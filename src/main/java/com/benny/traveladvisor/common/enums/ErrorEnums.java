package com.benny.traveladvisor.common.enums;

/**
 * This is the enum class for error settings
 *
 * @author benny.li
 * @data 2020/5/14
 */
public enum ErrorEnums {
    INVALID_PARAMETER(400,"400.00001","Invalid Parameter"),
    INVALID_TIMESTAMP(400,"400.00002","Invalid Timestamp"),
    UNAUTHORIZED(401,"401","Unauthorized"),
    PARTNER_NOT_FOUND(401,"401.00001","Partner Not Found"),
    ACCESS_FORBIDDEN(403,"403","Access Forbidden"),
    INVALID_SIGNATURE(403,"403.00001","Access Forbidden, Invalid Signature"),
    NOT_FOUND(404,"404","URL Not Found"),
    METHOD_NOT_ALLOW(405,"405.00001","Method Not Allowed"),
    SERVER_ERROR(500,"500","Internal Server Error");

    private final int status;
    private final String code;
    private final String msg;

    ErrorEnums(int status, String code, String msg) {
        this.status = status;
        this.code = code;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
