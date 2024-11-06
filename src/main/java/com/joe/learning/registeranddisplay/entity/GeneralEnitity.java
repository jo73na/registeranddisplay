package com.joe.learning.registeranddisplay.entity;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.*;
@Table(name = "generalentity")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GeneralEnitity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String dataOne;
private String dataTwo;
private int dataThree;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
