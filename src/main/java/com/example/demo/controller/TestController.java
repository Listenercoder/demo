package com.example.demo.controller;

import com.example.demo.consts.common.RetCodeEnum;
import com.example.demo.entity.domain.User;
import com.example.demo.entity.dto.common.ResponsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("hello")
    public ResponsDto hello(){
        List<User> list=new ArrayList<User>();
        list.add(new User(1,"lilei","i'm person"));
        list.add(new User(2,"hanmeimei","i'm girl"));
        return new ResponsDto.Builder().code(RetCodeEnum.ERROR.getCode()).data(list).build();
    }
}
