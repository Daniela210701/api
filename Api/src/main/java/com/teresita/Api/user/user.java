package com.teresita.Api.user;
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class user {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer numeroTel;
    @Basic
    private String  name;
    private String tipoUsuario;
    private  String correoElect;
    private String contrasena;




}
