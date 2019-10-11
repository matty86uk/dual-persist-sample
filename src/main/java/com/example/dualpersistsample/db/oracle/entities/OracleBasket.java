package com.example.dualpersistsample.db.oracle.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "BASKET", schema = "DEMO")
@Entity(name = "BASKET")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OracleBasket implements Serializable {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "TYPE")
    private String type;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.ALL},
            mappedBy = "id")
    private List<OracleFruit> fruits;

}
