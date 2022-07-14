package JPA.TEST.Project2.demo.controller;


import JPA.TEST.Project2.demo.dto.HelloResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello Spring Boot!";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDTO helloResponseDTO(@RequestParam("name") String name, @RequestParam("nickname") String nickname) {
        return new HelloResponseDTO(name, nickname);
    }

}
