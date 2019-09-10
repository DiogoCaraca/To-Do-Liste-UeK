package ch.zli.todoliste.model;

import javax.persistence.Entity;

@Entity
public class Admin extends User {

    public Admin() {
        this.setUsername("admin");
        this.setPassword("password");
    }
}
