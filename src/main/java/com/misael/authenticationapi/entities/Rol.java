package com.misael.authenticationapi.entities;

import jakarta.persistence.*;

@Entity
@Table(name="rol")
public class Rol {
    @Column(name = "name", nullable = false)
    private String Name;
    @Column(name = "description", nullable = false)
    private String  description;
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;


    }
}
