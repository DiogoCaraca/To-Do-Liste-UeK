package ch.zli.todoliste.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Liste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany
    private List<Stichpunkt> stichpunkte;

    @ManyToOne
    private User user;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stichpunkt> getStichpunkte() {
        return stichpunkte;
    }

    public void setStichpunkte(List<Stichpunkt> stichpunkte) {
        this.stichpunkte = stichpunkte;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
