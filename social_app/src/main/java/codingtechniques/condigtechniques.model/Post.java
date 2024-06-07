package condigtechniques.model;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

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

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "postId")
    List<Comment> comments = new ArrayList<>();

    public Post() {
        super();
    }

    public Post(Strig user, String content, int like, int unlike, List<Comment> comments) {
        super();
        this.user = user;
        this.content = content;
        this.like = like;
        this.unlike = unlike;
        this.comments = comments;
    }
}
