package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Kategori implements Serializable {

    @Id
    private String id;
    private String nama;

}
