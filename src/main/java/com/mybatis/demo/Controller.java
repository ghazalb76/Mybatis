package com.mybatis.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class Controller {

    @Resource
    Mapperr um;

    @GetMapping("/list")
    public List listUser() {
        return um.list();
    }
}
