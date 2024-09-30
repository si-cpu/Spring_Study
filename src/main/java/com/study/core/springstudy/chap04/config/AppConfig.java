package com.study.core.springstudy.chap04.config;

import com.study.springstudy.core.chap04.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
// 지정한 패키지 내에 있는 @Component 붙은 객체들을 전부 스캔해서 스프링 컨테이너에 등록시키겠다.
@ComponentScan(basePackages = "com.study.springstudy.core")
public class AppConfig {


}

