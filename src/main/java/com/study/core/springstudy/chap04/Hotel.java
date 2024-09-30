package com.study.core.springstudy.chap04;
/*
* @solution
* - 객체 생성의 제어권을 spring에게 모두 넘긴후
*   어노테이션 문법을 이용하여 객체 생성 및 빈 등록 로직을 대폭 감소
*
* @Component - 스프링 컨테이너에 빈으로 등록할 객체이다.
* @Autoiwired - 필드, 생성자, setter에 각각 등록가능
*               특정 객체가 다른 객체왕의 의존성을 가질때, 의존성 주입을 자동으로 처리해 주는 문법.
*               생성자에 붙이는 것을 권장
* @ Qualifier - 특정 타입을 만족하는 빈이 2개 이상일 경우, 스프링이 자체적으로 무엇을 주입할지
*               판단할 수 없기 떄문에, 별칭 등을 이용해서 주입할 빈을 직접 지목하는 문법.
* */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hotel {

    // 레스토랑
    private Restaurant restaurant;

    // 헤드셰프
    private Chef headchef;


    // 만약에 해당 클래스의 생성자가 단 한개 뿐이라면 자동으로 @Autowired를 붙임.
    @Autowired
    public Hotel( Restaurant restaurant,@Qualifier("kim") Chef headchef) {
        this.restaurant = restaurant;
        this.headchef = headchef;
    }

    // 호텔을 소개하는 기능
    public void inform(){
        System.out.printf("우리호텔의 레스토랑은 %s입니다. 그리고 헤드 쉐프는 %s입니다. \n",
                restaurant.getClass().getSimpleName(),
                headchef.getClass().getSimpleName());

        restaurant.order();
    }


}
