package condigtechniques.model;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "users")
    private Strig user;

    @Column(name = "contents")
    private String content;

    @Column(name = "post-like")
    private int like;

    @Column(name = "post-unlike")
    private int unlike;

    List<Comment> comments = new ArrayList<>();
}
