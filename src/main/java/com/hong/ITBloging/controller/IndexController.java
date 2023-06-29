package com.hong.ITBloging.controller;

import com.hong.ITBloging.domain.posts.Posts;
import com.hong.ITBloging.service.impl.PostsServiceImpl;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class IndexController {

    //메인 페이지
    private final PostsServiceImpl postsService;


    @GetMapping("/")
    public String index(Model model){

        List<Posts> postsList = postsService.findAllDesc();;
        model.addAttribute("posts",postsList);
        return "index";
    }


}
