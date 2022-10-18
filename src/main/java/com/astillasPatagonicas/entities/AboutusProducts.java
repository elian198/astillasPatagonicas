package com.astillasPatagonicas.entities;

import javax.persistence.*;

@Entity
public class AboutusProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String image;

    public AboutusProducts(Long id, String image) {
        this.id = id;
        this.image = image;
    }

    public AboutusProducts() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
