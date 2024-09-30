package com.study.core.springstudy.chap04;

import org.springframework.stereotype.Component;

@Component("jann")
public class JannChef implements Chef {

    @Override
    public void cook(){
        System.out.println("봉쥬류! 쟝쉐프입니다.");
        System.out.println("요리를 시작합니다.");
    }
}
