package com.example.memo.Controller;

import com.example.memo.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class MemoController {
    private final MemoService memoService;


    @GetMapping("/")
    public String getCustomer(Model model) {
        model.addAttribute("memos", memoService.getMemos());
        return "index";
    }
}