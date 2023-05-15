package com.hong.ITBloging.web;

import com.hong.ITBloging.domain.posts.Posts;
import com.hong.ITBloging.domain.posts.PostsRepository;
import com.hong.ITBloging.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class IndexController {

    //메인 페이지
    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model){

        List<Posts> postsList = postsService.findAllDesc();;
        model.addAttribute("posts",postsList);
        return "index";
    }


}
