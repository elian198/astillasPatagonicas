package com.astillasPatagonicas.entities;

import javax.persistence.*;

@Entity
public class Aboutus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String aboutUsDescription;

    public Aboutus(Long id, String aboutUsDescription) {
        this.id = id;
        this.aboutUsDescription = aboutUsDescription;
    }

    public Aboutus() {}

    public String getAboutUsDescription() {
        return aboutUsDescription;
    }

    public void setAboutUsDescription(String aboutUsDescription) {
        this.aboutUsDescription = aboutUsDescription;
    }
}
