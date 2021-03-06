package com.newtouch.lion.admin.web.model.role;/**
 * Created by jovi on 3/28/16.
 */

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2016
 * </p>
 * <p>
 * Company: XiQing
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
public class RoleAddResp {
    public final static String SUCCESS_ROLE_ADD_CODE = "200";
    public final static String SUCCESS_ROLE_ADD_MESSAGE = "添加成功";
    public final static String FAIL_ROLE_ADD_CODE = "201";
    public final static String FAIL_ROLE_ADD_MESSAGE = "添加失败";

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RoleAddResp(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
