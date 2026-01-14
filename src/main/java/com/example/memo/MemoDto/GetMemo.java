package com.example.memo.MemoDto;

import com.example.memo.entity.Memo;
import lombok.Data;

@Data
public class GetMemo {
    private Long id;
    private String memo;

    public GetMemo(Memo memo) {
        this.id = memo.getId();
        this.memo = memo.getMemo();
    }
}
