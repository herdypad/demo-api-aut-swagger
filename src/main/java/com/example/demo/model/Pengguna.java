package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Data
@NoArgsConstructor
public class Pengguna implements Serializable {

	@Id
	@Column(unique = true, nullable = false)
    private String id;
	
	
    @JsonIgnore
    private String password;
    private String nama;
    @JsonIgnore
    private String alamat;
    @JsonIgnore
    private String email;
    @JsonIgnore
    private String hp;
    @JsonIgnore
    private String roles;
    @JsonIgnore
    private Boolean isAktif;

    public Pengguna(String username) {
        this.id = username;
    }
}
