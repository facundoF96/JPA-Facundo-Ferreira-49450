package org.example;

import lombok.*;
import lombok.Builder;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Setter
@Getter
@ToString
@Builder

public class Cliente  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;
}

