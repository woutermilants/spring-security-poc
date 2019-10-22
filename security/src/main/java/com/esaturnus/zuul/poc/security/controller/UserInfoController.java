package com.esaturnus.zuul.poc.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserInfoController {

    @GetMapping("/userinfo")
    public UserInfo userInfo(Principal principal) {
        return new UserInfo(principal.getName(), "zuul", "poc", "zuul@poc.com");
    }
}
