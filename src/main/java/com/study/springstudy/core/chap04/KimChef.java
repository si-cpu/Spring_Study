package com.study.springstudy.core.chap04;

import org.springframework.stereotype.Component;

@Component("kim")
public class KimChef implements Chef {

    @Override
    public void cook() {
        System.out.println("안녕하세요. 김쉐프입니다.");
        System.out.println("요리를 시작합니다.");
    }

}
