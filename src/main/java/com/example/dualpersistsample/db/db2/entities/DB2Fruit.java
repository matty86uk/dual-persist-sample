package com.example.dualpersistsample.db.db2.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "FRUIT", schema = "DEMO")
@Entity(name = "FRUIT")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DB2Fruit {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "QUALITY")
    private String quality;

    @ManyToOne
    @JoinColumn(name = "basket_id", referencedColumnName = "id")
    private DB2Fruit basket;

}
