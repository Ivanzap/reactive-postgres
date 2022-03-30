package com.example.reactivepostgres.to;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table
@Data
public class PersonTo {

    @Id
    @JsonIgnore
    private Integer id;

    @Column
    private String name;
}
