package codingtechniques.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import condigtechniques.repository.PostRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/socila/api")
public class SocialAppController {

    @Autowired
    private PostRepository PostRepository;

    @GetMapping("/posts")
    public Iterable<Post> getAllPost() {
        return PostRepository.findAll();

    }

    @PostMapping("/add-post")
    public Post savePost(@RequestBody Post post) {
        return PostRepository.save(post);
    }

}