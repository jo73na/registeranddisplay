package com.joe.learning.registeranddisplay.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GeneralDTO {

    private Long id;
    private String dataOne;
    private String dataTwo;
    private int dataThree;

}
