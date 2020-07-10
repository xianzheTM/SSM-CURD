package com.company.bean;

import java.util.HashMap;

/**
 * @author xianzheTM
 * @version 1.0
 * @date 2020/7/10 9:41
 */
public class Msg {
    //状态码100-成功,200-失败
    private int code;
    //提示信息
    private String message;
    //用户要返回的数据
    private HashMap<String, Object> extend = new HashMap<>();

    public static Msg success(){
        Msg result = new Msg();
        result.setCode(100);
        result.setMessage("处理成功");
        return result;
    }

    public static Msg fail(){
        Msg result = new Msg();
        result.setCode(200);
        result.setMessage("处理失败");
        return result;
    }

    public Msg add(String key, Object value) {
        this.getExtend().put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HashMap<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(HashMap<String, Object> extend) {
        this.extend = extend;
    }
}
