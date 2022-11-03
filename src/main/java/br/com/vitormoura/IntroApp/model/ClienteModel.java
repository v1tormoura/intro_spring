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

    //..new attributes of V2
    @Column(nullable = true, length = 100)
    @Getter @Setter
    private String email;

    //.. relationship with ProfessionModel
    @ManyToOne
    @JoinColumn(name = "profession_id")
    @Setter @Getter
    private ProfessionModel profession;



}
