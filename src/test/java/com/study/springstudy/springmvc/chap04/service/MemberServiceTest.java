package com.study.springstudy.springmvc.chap04.service;

import com.study.springstudy.springmvc.chap04.dto.request.SignUpRequestDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Test
    @DisplayName("회원가입을 하면 비밀번호가 암호화 될것이다.")
    void joinTest () {
        // given
        SignUpRequestDTO.builder()
                .account("kim1234")
                .password("kkkk1234!")
                .email("kim1234@naver.com")
                .name("김철수")
                .build();

        // when
        boolean flag = memberService.join(dto);
        // then
        assertTrue(flag);
    }
@Test
@DisplayName("id가 존재하지 않을 경우를 테스트한다.")
void nnoAccTest() {
    // given
    String account = "park1234";
    String password = "ppp4231";
    // when
    LoginResult result = memberService.authenticate(account, password);

    // then
    assertEquals(LoginResult.NO_ACC, result);
}

    @Test
    @DisplayName("pw가 존재하지 않을 경우를 테스트한다.")
    void nnoPwTest() {
        // given
        String account = "kim1234";
        String password = "ppp4231";
        // when
        LoginResult result = memberService.authenticate(account, password);

        // then
        assertEquals(LoginResult.NO_PW, result);
    }

    @Test
    @DisplayName("로그인이 성공할 경우를 테스트한다.")
    void loginSuccessTest() {
        // given
        String account = "kim1234";
        String password = "kkkk1234!";
        // when
        LoginResult result = memberService.authenticate(account, password);

        // then
        assertEquals(LoginResult.SUCCESS, result);
    }
}