package com.lanmao.test01;

import java.util.Date;

public class realizationdemo01 implements interfacedemo01 {
    @Override
    public Date string2Date(String str) {
        return DateUtils.string2Date(str);
    }
}
