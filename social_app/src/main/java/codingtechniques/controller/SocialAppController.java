package codingtechniques.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import condigtechniques.repository.PostRepository;

@RestController
@RequestMapping("/socila/api")
public class SocialAppController {

    @Autowired
    private PostRepository PostRepository;

}
