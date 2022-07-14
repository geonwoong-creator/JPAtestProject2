package JPA.TEST.Project2.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {


    /**
     * 회원가입
     * @return
     * @throws Exception
     */
    @GetMapping("/auth/user/save")
    public String userSave() throws Exception {
        return "layout/user/user-save";
    }

    /**
     * 로그인
     */
    @GetMapping("/auth/user/login")
    public String userLogin() {
        return "layout/user/user-login";
    }
}
