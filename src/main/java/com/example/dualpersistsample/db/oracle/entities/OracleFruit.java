package com.example.dualpersistsample.db.oracle.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "FRUIT", schema = "DEMO")
@Entity(name = "FRUIT")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OracleFruit implements Serializable {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "RATING")
    private String rating;

    @Column(name = "COLOUR")
    private String colour;

    @ManyToOne
    @JoinColumn(name = "basket_id", referencedColumnName = "id")
    private OracleBasket basket;

}
