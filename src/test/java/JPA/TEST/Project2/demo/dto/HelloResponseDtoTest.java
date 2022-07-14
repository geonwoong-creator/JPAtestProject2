package JPA.TEST.Project2.demo.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {

        //given
        String name = "geonwoong";
        String nickname = "babo";

        //when
        HelloResponseDTO helloResponseDTO = new HelloResponseDTO(name, nickname); //필드가 포함된 생성자를 만듬

        //then
        assertThat(helloResponseDTO.getName()).isEqualTo(name); //get 메소드를 선언하지 않아도 getName() 을 사용할 수 있음
        assertThat(helloResponseDTO.getNickname()).isEqualTo(nickname);
    }
}
