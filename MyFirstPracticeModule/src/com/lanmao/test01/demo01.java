package com.lanmao.test01;

import java.util.Date;

public class demo01 {
    public static void main(String[] args) {
        interfacedemo01 interfacedemo01 = new realizationdemo01();
        Date date = interfacedemo01.string2Date("2019-01-01 05:05:05");
        System.out.println(date);
    }
}
