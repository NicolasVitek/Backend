package com.example.demo.model;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "Clients")
public class client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<resultText> resultados;
    private String name;
    private String lastName;
    private String userName;
    private String city;
    private String state;
    private int zipCode;
    public client(){}
    public client(String name, String lastName, String userName, String city, String state, int zipCode){
        this.name=name;
        this.lastName=lastName;
        this.userName=userName;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
    }
    public List<resultText> getText(){
        return resultados;
    }
}
