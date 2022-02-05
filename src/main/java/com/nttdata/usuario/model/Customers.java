package com.nttdata.usuario.model;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "customers")
public class Customers {

    @Id
    private double id;
    private String code;
    private String name;
    private String type;
}
