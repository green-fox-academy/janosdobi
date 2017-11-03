package com.greenfox.reddit.contollers;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping({"", "/"})
    public String listAllPosts(@RequestParam(value = "pageId", defaultValue = "0") int pageId, Model model) {
        model.addAttribute("posts", postService.listAllPosts(pageId));
        model.addAttribute("pageId", pageId);
        return "index";
    }

    @GetMapping("/addPost")
    public String addPost(Model model) {
        model.addAttribute("post", new Post());
        return "addPost";
    }

    @PostMapping("/addPost")
    public String addPost(@ModelAttribute Post post) {
        postService.addNewPost(post);
        return "redirect:";
    }

    @GetMapping("/{id}/upvote")
    public String upvote(@PathVariable("id") Long id) {
        postService.upvotePost(id);
        return "redirect:/posts/";
    }

    @GetMapping("/{id}/downvote")
    public String downvote(@PathVariable("id") Long id) {
        postService.downvotePost(id);
        return "redirect:/posts/";
    }
}
