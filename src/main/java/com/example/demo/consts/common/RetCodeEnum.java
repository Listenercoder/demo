package com.example.demo.consts.common;

/**
 * 向前端返回的结果码枚举
 *
 * @author momei
 */
public enum RetCodeEnum {

    SUCCESS(0,"成功"),
    ERROR(-1,"失败");

    private int code;
    private String msg;

    RetCodeEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode(){
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public static String getMsgByCode(int code){
        for(RetCodeEnum item : RetCodeEnum.values()){
            if(item.code == code){
                return item.msg;
            }
        }
        return "未知结果码";
    }
}
