package com.hy.exception;

public class HyException extends RuntimeException{

    private ErrorCode errorCode;

    public HyException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.errorCode = errorCode;
    }


    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
