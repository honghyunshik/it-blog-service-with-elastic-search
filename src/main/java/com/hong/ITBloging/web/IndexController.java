package com.hong.ITBloging.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    //메인 페이지

    @GetMapping("/")
    public String index(Model model){

        //model.addAttribute("posts",)
        return "index";
    }


}
