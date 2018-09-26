package com.example.demo.entity.dto.common;


import com.example.demo.consts.common.RetCodeEnum;

/**
 * 向前端返回的数据对象
 *
 * @author momei
 */
public class ResponsDto {

    private int code;

    private String msg;

    private Object data;

    private ResponsDto(){

    }

    public boolean Success(){
        return this.code == RetCodeEnum.SUCCESS.getCode();
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static class Builder {
        ResponsDto responsDto;
        public Builder(){
            responsDto = new ResponsDto();
        }

        public Builder success(){
            responsDto.code = RetCodeEnum.SUCCESS.getCode();
            responsDto.msg = RetCodeEnum.SUCCESS.getMsg();
            return this;
        }

        public Builder error(){
            responsDto.code = RetCodeEnum.ERROR.getCode();
            responsDto.msg = RetCodeEnum.ERROR.getMsg();
            return this;
        }

        public Builder code(int code){
            responsDto.code = code;
            responsDto.msg = RetCodeEnum.getMsgByCode(code);
            return this;
        }

        public Builder data(Object data){
            responsDto.data = data;
            return this;
        }
        public ResponsDto build(){
            return responsDto;
        }

    }
}
