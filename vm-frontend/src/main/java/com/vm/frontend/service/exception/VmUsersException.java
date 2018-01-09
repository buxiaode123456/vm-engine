package com.vm.frontend.service.exception;

import com.vm.base.exception.VmRuntimeException;
import com.vm.base.utils.Response;

import java.util.Map;

/**
 * Created by ZhangKe on 2018/1/9.
 */
public class VmUsersException extends VmRuntimeException {
    public VmUsersException(int errorCode, String message, Map params, Throwable e) {
        super(errorCode, message, params, e);
    }

    public VmUsersException(int errorCode, String message, Map data) {
        super(errorCode, message, data);
    }

    public VmUsersException(int errorCode, String message) {
        super(errorCode, message);
    }

    public VmUsersException(Response.ResponseCode errorCode) {
        super(errorCode);
    }

    public VmUsersException(String message) {
        super(message);
    }

    public enum ErrorCode {
        USER_IS_NOT_EXITS(-1, "账户不存在"),
        PASSWORD_ERROR(-2, "密码错误");

        int code;
        String msg;

        ErrorCode(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

    }
}
