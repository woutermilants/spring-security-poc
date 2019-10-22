package com.esaturnus.zuul.poc.security.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserInfo {

    private final String userName;
    private final String firstName;
    private final String lastName;
    private final String email;

    public String getFirstAndLastName() {
        return  firstName +  " " + lastName;
    }
}
