package JPA.TEST.Project2.demo.service;

import JPA.TEST.Project2.demo.domain.board.Board;
import JPA.TEST.Project2.demo.domain.board.BoardRepository;
import JPA.TEST.Project2.demo.domain.user.User;
import JPA.TEST.Project2.demo.dto.board.BoardSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public Long save(BoardSaveRequestDto boardSaveRequestDto) {
        return boardRepository.save(boardSaveRequestDto.toEntity()).getId();
    }

    /**
     * 글목록 로직
     */
    public List<Board> findAll(){
        return boardRepository.findAll();
    }
}