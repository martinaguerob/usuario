package com.nttdata.usuario.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document(collation = "Customers")
public class Customers {

    @Id
    private double id;
    private String code;
    private String name;
    private String type;

}