package condigtechniques.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Post {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
