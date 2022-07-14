package JPA.TEST.Project2.demo.controller.api;

import JPA.TEST.Project2.demo.config.auth.PrincipalDetail;
import JPA.TEST.Project2.demo.domain.board.Board;
import JPA.TEST.Project2.demo.dto.board.BoardSaveRequestDto;
import JPA.TEST.Project2.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BoardApiController {

    private final BoardService boardService;

    /**
     * 글작성 API
     */
    @PostMapping("/api/v1/board")
    public Long save(@RequestBody BoardSaveRequestDto boardSaveRequestDto) {
        return boardService.save(boardSaveRequestDto);
    }
}