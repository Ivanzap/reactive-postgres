package com.example.reactivepostgres.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table
@Data
public class Person {

    @Id
    private Integer id;

    @Column
    private String name;
}
