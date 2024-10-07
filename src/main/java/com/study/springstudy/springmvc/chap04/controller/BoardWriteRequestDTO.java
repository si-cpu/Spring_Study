package com.study.springstudy.springmvc.chap04.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.PostMapping;

@Getter@Setter
@ToString
public class BoardWriteRequestDTO {
    private String writer;
    private String title;
    private String content;
}


