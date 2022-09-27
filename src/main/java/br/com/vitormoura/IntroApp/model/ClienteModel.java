package br.com.vitormoura.IntroApp.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter
    private long id;

    @Column(name = "name", nullable = false, length = 50)
    @Setter @Getter
    private String name;

    @Column(nullable = false, length = 1)
    @Setter @Getter
    private String gender;

    @Column(nullable = false, length = 50)
    @Setter @Getter
    private String city;


}
