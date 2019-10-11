package com.example.dualpersistsample.db.db2.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "BASKET", schema = "DEMO")
@Entity(name = "BASKET")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DB2Basket {

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
    private List<DB2Fruit> fruits;
}
