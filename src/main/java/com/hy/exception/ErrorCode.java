package com.hy.exception;

/**
 * 异常枚举
 */
public enum ErrorCode {

    PARAM_ERROR("100001","参数错误" );

    private String code;
    private String msg;

    ErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
