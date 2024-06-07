package condigtechniques.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Strig user;
    private String content;

    public Comment() {
        super();
    }

    public Comment(String user, String content) {
        super();
        this.user = user;
        this.content = content;

    }
}
