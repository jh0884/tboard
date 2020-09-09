package com.tboard.example.tboard.service;

import com.tboard.example.tboard.domain.repository.BoardRepository;
import com.tboard.example.tboard.dto.BoardDto;
import org.springframework.transaction.annotation.Transactional;

public class BoardService {
    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Transactional
    public Long savePost(BoardDto boardDto) {
        return boardRepository.save(boardDto.toEntity()).getId();
    }
}
