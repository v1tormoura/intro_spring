package br.com.vitormoura.IntroApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@Data
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 1)
    private String gender;

    @Column(nullable = false, length = 50)
    private String city;


}
