package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "TextAnalyzedResults")
public class resultText {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String scoreTag, irony, subjectivity, agreement;
    private byte confidence;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private client cliente;
    public resultText(String scoreTag, String irony, String subjectivity, String agreement, byte confidence){   
        this.scoreTag=scoreTag;
        this.irony=irony;
        this.subjectivity=subjectivity;
        this.agreement=agreement;
        this.confidence=confidence;
    }
    public void setClient(client cliente){
        this.cliente=cliente;
    }
}
