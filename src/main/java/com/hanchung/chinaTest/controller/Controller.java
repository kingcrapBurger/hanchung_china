package com.hanchung.chinaTest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    private final Logger log = LoggerFactory.getLogger(getClass());

//  인덱스
    @PostMapping("index")
    public String index(){
        log.trace("");
        log.trace("--------------");

        return "index";
    }

//    로그인페이지
    @PostMapping("loginForm")
    public String loginForm(){
        log.trace("loginForm 진입");
        log.trace("--------------");

        return "loginForm";
    }

    //    로그인
    @PostMapping("login")
    public String login(){
        log.trace("login 진입");
        log.trace("--------------");

        return "login";
    }
}
