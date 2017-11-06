package com.greenfox.reddit.contollers;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.model.User;
import com.greenfox.reddit.service.PostService;
import com.greenfox.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @Autowired
    UserService userService;

    @GetMapping({"", "/"})
    public String listAllPosts(@RequestParam(value = "pageId", defaultValue = "0") int pageId, Model model) {
        model.addAttribute("posts", postService.listAllPosts(pageId));
        model.addAttribute("pageId", pageId);
        return "index";
    }

    @GetMapping("/user")
    public String listAllPostsForLoggedInUser(@RequestParam(value = "id") Long userId,
                               @RequestParam(value = "pageId", defaultValue = "0") int pageId,
                               Model model) {
        model.addAttribute("posts", postService.listByUser(userId, pageId));
        model.addAttribute("pageId", pageId);
        User user = userService.findOne(userId);
        model.addAttribute(user);
        return "index";
    }

    @GetMapping("/addPost")
    public String addPost(Model model) {
        model.addAttribute("post", new Post());
        model.addAttribute("users", userService.listAllUsers());
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