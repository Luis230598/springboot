package com.example.ejercico.models;
import javax.persistence.*;

@Entity
@Table(name="animal")
public class animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )

    private long id;
    private String especie;
    private String nombre;
    private String color;
    private String token;

    

    public String getNombre() {
        return nombre;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
