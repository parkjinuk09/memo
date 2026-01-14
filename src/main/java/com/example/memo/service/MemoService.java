package com.example.memo.service;

import com.example.memo.MemoDto.GetMemo;
import com.example.memo.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MemoService {
    private final MemoRepository memoRepository;

    public List<GetMemo> getMemos() {
        return memoRepository.findAll()
                .stream()
                .map(GetMemo::new)
                .toList();
    }
}
