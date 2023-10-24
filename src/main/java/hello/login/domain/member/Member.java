package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Member {

    private Long id;

    @NotNull
    private String loginId; //로그인 ID

    @NotNull
    private String name; //사용자 이름

    @NotNull
    private String password;
}
