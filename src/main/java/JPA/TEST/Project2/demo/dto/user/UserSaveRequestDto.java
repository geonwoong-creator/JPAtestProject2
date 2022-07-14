package JPA.TEST.Project2.demo.dto.user;


import JPA.TEST.Project2.demo.domain.user.Role;
import JPA.TEST.Project2.demo.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class UserSaveRequestDto {

    private String username;

    private String nickname;

    private String email;

    private String password;

    private Role role;

    public User toEntity() {
        return User.builder()
                .username(username)
                .nickname(nickname)
                .email(email)
                .password(password)
                .role(Role.USER)
                .build();
    }
}
