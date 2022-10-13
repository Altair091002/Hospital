package com.hospital.isd3project.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "diseases")
public class Diseases {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public Diseases() {}
}
