package com.example.gift_memory_app;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "occasions")
public class Occasion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String occasionName;

    private LocalDate occasionDate;

    private String occasionType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOccasionName() {
        return occasionName;
    }

    public void setOccasionName(String occasionName) {
        this.occasionName = occasionName;
    }

    public LocalDate getOccasionDate() {
        return occasionDate;
    }

    public void setOccasionDate(LocalDate occasionDate) {
        this.occasionDate = occasionDate;
    }

    public String getOccasionType() {
        return occasionType;
    }

    public void setOccasionType(String occasionType) {
        this.occasionType = occasionType;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
